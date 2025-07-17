package main.java.com.example.hms.controller;


import com.example.hms.model.PredictionRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Controller
public class PredictionController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/predict")
    public String predict(@ModelAttribute PredictionRequest predictionRequest, Model model) {
        try {
            // Build the command to execute the Python script
            String[] command = new String[]{
                    "python3",
                    "python/predict.py",
                    String.valueOf(predictionRequest.getFeature1()),
                    String.valueOf(predictionRequest.getFeature2())
                    // Add more features as needed
            };

            // Start the process
            ProcessBuilder pb = new ProcessBuilder(command);
            pb.redirectErrorStream(true);
            Process p = pb.start();

            // Get the output of the script
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String output;
            StringBuilder result = new StringBuilder();
            while ((output = in.readLine()) != null) {
                result.append(output);
            }

            // Wait for the process to finish
            p.waitFor();

            // Add the prediction result to the model
            model.addAttribute("prediction", result.toString());

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("prediction", "Error occurred while making the prediction.");
        }
        return "index";
    }
}

