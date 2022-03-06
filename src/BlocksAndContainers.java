public class BlocksAndContainers {

    public static void main(String[] args) {
        int AmountOfBricks = 63;
        int ContainerCapacity = 4;
        int FullContainers;
        int BricksInUnfilledContainers;
        int TotalContainers;

        //Amount of full containers
        FullContainers = AmountOfBricks / ContainerCapacity;
        System.out.println("We have "+ FullContainers + " full containers ");

        //Total number of containers is full containers plus unfilled container which is
        TotalContainers = FullContainers + 1;
        System.out.println( " we have "+ TotalContainers + " containers in total");

        // Number of bricks in the unfilled container
        BricksInUnfilledContainers = AmountOfBricks % ContainerCapacity;
        System.out.println("The unfilled container has" + BricksInUnfilledContainers + "bricks");
    }
}