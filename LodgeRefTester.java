public class LodgeRefTester
{
    public static void main(String[] args) 
	{  
	LodgeRef.numOfRoomers = 15;
	LodgeRef.totalNumRooms = 4;
	LodgeRef.lodgeRating = 7.5f;
	LodgeRef.lodgeCloseTime = 11.05;
	LodgeRef.lodgeFloorName = 'T';
	LodgeRef. numOfBedRoom = 4;
    LodgeRef.numowner = 2;
	LodgeRef.isAvailable = true;
	LodgeRef.lodgeName = "udaya lodge" ;
        System.out.println("Values of Given variables:");	
        System.out.println("Number of Roomers :" + LodgeRef.numOfRoomers);
		System.out.println("Total Number of Rooms :" + LodgeRef.totalNumRooms);
		System.out.println("Total Lodge rating :" + LodgeRef.lodgeRating);
		System.out.println("Lodge closing Timings  :" + LodgeRef.lodgeCloseTime);
		System.out.println("Name of the Lodge Floors :" + LodgeRef.lodgeFloorName);
		System.out.println("Number of Beds in One Room :" + LodgeRef.numOfBedRoom);
		System.out.println("Number of Owners :" + LodgeRef.numowner);
		System.out.println("If is Now Available :" + LodgeRef.isAvailable);
		System.out.println("Lodge Name :" + LodgeRef.lodgeName);
		System.out.println("owner available:" + LodgeRef.ownerAvail);
    }
}