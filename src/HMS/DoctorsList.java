package HMS;

class DNode
{
	Doctor doctor;
	DNode next, pre;
	
	public DNode()
	{
		
	}
	public DNode(Doctor doctor)
	{
		this.doctor=doctor;
		next=null;
		pre=null;
	}
}

public class DoctorsList {
	DNode head, tail;
	
	public DoctorsList()
	{
		head=null;
		tail=null;
	}
	
	public void Insert(Doctor doctor)
	{
		DNode node= new DNode(doctor);
		
		if(head==null || tail==null)
		{
			head=node;
			tail=node;
			
		}
		
		else
		{
			head.next=node;
			node.pre=head;
			head=node;
			
		}
					
	}
	
	
	public Doctor searchByID(String id)
	{
		DNode temp=head;
		while(temp!=null)
		{
			
		if(temp.doctor.getContact().equals(id))
		{
			return temp.doctor;
		}
			temp=temp.pre;
		}
		
		return null;
		
	}
	
	public void AllDoctorInfo()
	{
		DNode temp=head;
		while(temp!=null)
		{
			System.out.println("Doctor ID="+temp.doctor.getId()+"   Speciality=" + temp.doctor.getSpecification());
			
		
			temp=temp.pre;
		}
	
		
		
	}
        
        public Doctor getAtIndex(int index)
        {
            DNode temp=head;
            for(int i=0;i<index;i++)
            {
                temp=temp.pre;
            }
            return temp.doctor;
        }
        
        public int size()
        {
            DNode temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.pre;
            }
            return count;
  
        }
        
        public void PrintData()
        {
            DNode temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                System.out.print(count+": "+temp.doctor.toString());
               temp=temp.pre;
            }
        }
	
	
	

}
