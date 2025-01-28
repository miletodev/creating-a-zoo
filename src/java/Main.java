package java;

import java.util.Scanner;

        /**
         * java.Main class to run the Zoo java.Animal program.
         * This class provides a menu-driven interface to interact with different animals.
         *
         * This program demonstrates the use of interfaces, inheritance, and polymorphism in Java.
         * And it's part of te final challenge of the course "Introduction to Software Development" by Amazon.
         * The program allows the user to choose an animal from the Zoo and then perform various operations on the chosen animal.
         * The user can set properties, display properties, display movement, and display eating behavior of the chosen animal.
         *
         * This version is a study case of the final challenge, and it's not the final version of the program.
         */
        public class Main {
            public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                int continueOuterLoop = 1;
                int continueInnerLoop;
                int menuChoice;
                Tiger myTiger = new Tiger();
                Dolphin myDolphin = new Dolphin();
                Penguin myPenguin = new Penguin();

                // Outer loop to continue the main Zoo menu
                do {
                    System.out.println("******* ZOO ANIMAL choice menu ******\n1. java.Tiger\n2. java.Dolphin\n3. java.Penguin\nEnter choice of animal (1-3): ");
                    menuChoice = animalChoiceMenu(keyboard);
                    switch (menuChoice) {
                        case 1:
                            System.out.println("The animal which is chosen is : " + myTiger.getNameOfAnimal());
                            // Inner loop to continue with the chosen animal
                            do {
                                System.out.println("1. Set properties\n2. Display properties\n3.Display movement\n4. Display eating");
                                menuChoice = animalDetailsManipulationMenu(keyboard, myTiger);
                                switch (menuChoice) {
                                    case 1:
                                        // Set properties for java.Tiger
                                        System.out.println("Enter the tiger's name: ");
                                        myTiger.setNameOfAnimal(keyboard.nextLine());
                                        System.out.println("Enter weight: ");
                                        myTiger.setWeight(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter height: ");
                                        myTiger.setHeight(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter age: ");
                                        myTiger.setAge(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter number of stripes:");
                                        myTiger.setNumberOfStripes(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter speed: ");
                                        myTiger.setSpeed(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter sound level of roar: ");
                                        myTiger.setSoundLevelOfRoar(keyboard.nextInt());
                                        keyboard.nextLine();
                                        break;
                                    case 2:
                                        // Display properties of java.Tiger
                                        System.out.println("java.Tiger's name: " + myTiger.getNameOfAnimal());
                                        System.out.println("Weight: " + myTiger.getWeight());
                                        System.out.println("Height: " + myTiger.getHeight());
                                        System.out.println("Age: " + myTiger.getAge());
                                        System.out.println("Stripes: " + myTiger.getNumberOfStripes());
                                        System.out.println("Speed: " + myTiger.getSpeed());
                                        System.out.println("Roar: " + myTiger.getSoundLevelOfRoar());
                                        break;
                                    case 3:
                                        // Display movement of java.Tiger
                                        myTiger.walking();
                                        break;
                                    case 4:
                                        // Display eating behavior of java.Tiger
                                        myTiger.eatingFood();
                                        myTiger.eatingCompleted();
                                        break;
                                }
                                System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                                continueInnerLoop = keyboard.nextInt();
                                keyboard.nextLine();
                            } while (continueInnerLoop == 1);
                            break;
                        case 2:
                            System.out.println("The animal which is chosen is : " + myDolphin.getNameOfAnimal());
                            // Inner loop to continue with the chosen animal
                            do {
                                System.out.println("1. Set properties\n2. Display properties\n3.Display movement\n4. Display eating");
                                menuChoice = animalDetailsManipulationMenu(keyboard, myDolphin);
                                switch (menuChoice) {
                                    case 1:
                                        // Set properties for java.Dolphin
                                        System.out.println("Enter the dolphin's name: ");
                                        myDolphin.setNameOfAnimal(keyboard.nextLine());
                                        System.out.println("Enter weight: ");
                                        myDolphin.setWeight(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter height: ");
                                        myDolphin.setHeight(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter age: ");
                                        myDolphin.setAge(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter color:");
                                        myDolphin.setColor(keyboard.nextLine());
                                        System.out.println("Enter swimming speed: ");
                                        myDolphin.setSwimmingSpeed(keyboard.nextInt());
                                        keyboard.nextLine();
                                        break;
                                    case 2:
                                        // Display properties of java.Dolphin
                                        System.out.println("java.Dolphin's name: " + myDolphin.getNameOfAnimal());
                                        System.out.println("Weight: " + myDolphin.getWeight());
                                        System.out.println("Height: " + myDolphin.getHeight());
                                        System.out.println("Age: " + myDolphin.getAge());
                                        System.out.println("Color: " + myDolphin.getColor());
                                        System.out.println("Swimming speed: " + myDolphin.getSwimmingSpeed());
                                        break;
                                    case 3:
                                        // Display movement of java.Dolphin
                                        myDolphin.swimming();
                                        break;
                                    case 4:
                                        // Display eating behavior of java.Dolphin
                                        myDolphin.eatingFood();
                                        myDolphin.eatingCompleted();
                                        break;
                                }
                                System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                                continueInnerLoop = keyboard.nextInt();
                                keyboard.nextLine();
                            } while (continueInnerLoop == 1);
                            break;
                        case 3:
                            System.out.println("The animal which is chosen is : " + myPenguin.getNameOfAnimal());
                            // Inner loop to continue with the chosen animal
                            do {
                                System.out.println("1. Set properties\n2. Display properties\n3.Display movement\n4. Display eating");
                                menuChoice = animalDetailsManipulationMenu(keyboard, myPenguin);
                                switch (menuChoice) {
                                    case 1:
                                        // Set properties for java.Penguin
                                        System.out.println("Enter the penguin's name: ");
                                        myPenguin.setNameOfAnimal(keyboard.nextLine());
                                        System.out.println("Enter weight: ");
                                        myPenguin.setWeight(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter height: ");
                                        myPenguin.setHeight(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter age: ");
                                        myPenguin.setAge(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter color:");
                                        myPenguin.setColor(keyboard.nextLine());
                                        System.out.println("Enter swimming speed: ");
                                        myPenguin.setSwimmingSpeed(keyboard.nextInt());
                                        keyboard.nextLine();
                                        System.out.println("Enter walking speed: ");
                                        myPenguin.setWalkingSpeed(keyboard.nextInt());
                                        keyboard.nextLine();
                                        break;
                                    case 2:
                                        // Display properties of java.Penguin
                                        System.out.println("java.Penguin's name: " + myPenguin.getNameOfAnimal());
                                        System.out.println("Weight: " + myPenguin.getWeight());
                                        System.out.println("Height: " + myPenguin.getHeight());
                                        System.out.println("Age: " + myPenguin.getAge());
                                        System.out.println("Color: " + myPenguin.getColor());
                                        System.out.println("Swimming speed: " + myPenguin.getSwimmingSpeed());
                                        System.out.println("Walking speed: " + myPenguin.getWalkingSpeed());
                                        break;
                                    case 3:
                                        // Display movement of java.Penguin
                                        System.out.println("Should it be swimming (S) or walking? (W)");
                                        String choice = keyboard.nextLine();
                                        if (choice.equalsIgnoreCase("S")) {
                                            myPenguin.swimming();
                                        } else if (choice.equalsIgnoreCase("W")) {
                                            myPenguin.walking();
                                        } else {
                                            System.out.println("Invalid choice. Try 'S' for swimming or 'W' for walking");
                                        }
                                        break;
                                    case 4:
                                        // Display eating behavior of java.Penguin
                                        myPenguin.eatingFood();
                                        myPenguin.eatingCompleted();
                                        break;
                                }
                                System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                                continueInnerLoop = keyboard.nextInt();
                                keyboard.nextLine();
                            } while (continueInnerLoop == 1);
                            break;
                        default:
                            System.out.println("Not supported");
                    }
                    System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
                    continueOuterLoop = keyboard.nextInt();
                    keyboard.nextLine();
                } while (continueOuterLoop == 1);
            }

            /**
             * Displays the animal choice menu and returns the user's choice.
             *
             * @param keyboard Scanner object to read user input
             * @return the choice of animal given by the user
             */
            public static int animalChoiceMenu(Scanner keyboard) {
                int choiceGivenByUser;
                System.out.println("******* ZOO ANIMAL choice menu ******");
                System.out.println("1. java.Tiger");
                System.out.println("2. java.Dolphin");
                System.out.println("3. java.Penguin");
                System.out.println("Enter choice of animal:");
                choiceGivenByUser = keyboard.nextInt();
                keyboard.nextLine();
                return choiceGivenByUser;
            }

            /**
             * Displays the animal details manipulation menu and returns the user's choice.
             *
             * @param keyboard Scanner object to read user input
             * @param animal   the animal object for which details are to be manipulated
             * @return the choice given by the user
             */
            public static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
                int choiceGivenByUser;
                System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
                System.out.println("1. Set properties");
                System.out.println("2. Display properties");
                System.out.println("3. Display movement");
                System.out.println("4. Display eating");
                System.out.println("5. Exit");
                System.out.println("Enter choice (1-5):");
                choiceGivenByUser = keyboard.nextInt();
                keyboard.nextLine();
                return choiceGivenByUser;
            }
        }