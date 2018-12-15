/*  PROBLEM
 * Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
 state (on/off), 
 current volume, 
 current channel, 
 increase and decrease volume and 
 change channel
 turn it on and off.
     
Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state,
 volume and channel..finally turn it off.
 
 */
public class Television {
	
		private static boolean state = false;
		private int volume;
		private int currentChannel = 101;
		
		public boolean setState(boolean turnOnOff)
		{
			this.state = turnOnOff;
			return this.state;
		}
		
		public int changeVolume(int volume)
		{
			if(this.state == true)
			{	
				this.volume = (this.volume+volume) < 0 ? 0 : (this.volume+volume);
				return this.volume;
			}
			return -1;
		}
		
		public int changeChannel(int channel)
		{
			if(this.state == true)
			{
				if(channel<300)
					this.currentChannel = channel;
				
				return this.currentChannel;
			}
			return -1;
		}
		
		public int getCurrentChannel()
		{
			if(this.state == true)
			return this.currentChannel;
			
			return -1;
		}
		
		public int getVolume()
		{
			if(this.state == true)
				return this.volume;
			
			return -1;
		}
}
