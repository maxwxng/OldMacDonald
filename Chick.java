class Chick implements Animal 
{     
    private String myType;     
    private String mySound;      
    private String mySound2;
    public Chick(String type, String sound, String sound2)     {         
        myType = type;         
        mySound = sound;
        mySound2 = sound2;     
    }     
    public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound()
     {
     	if(Math.random()<0.5){
     		return mySound;
     	}
     	else{
     		return mySound2;
     	}
  
     }

     public String getType(){return myType;} 
}
