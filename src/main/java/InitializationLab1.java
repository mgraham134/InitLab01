/**
 * Created by michaelgraham on 1/20/16.
 */

import java.util.*;

class InitializationLab1 {

    public static void main(String[] args) {

        BoringThing veryBoring1 = new BoringThing();                                   //New objects were created
        BoringThing veryBoring2 = new BoringThing();
        BoringThing veryBoring3 = new BoringThing();
        BoringThing veryBoring4 = new BoringThing();
        BoringThing veryBoring5 = new BoringThing();

        ColorfulThing red = new ColorfulThing(ColorfulThing.ColorEnum.Red);            //enum was added to work with main
        ColorfulThing green = new ColorfulThing(ColorfulThing.ColorEnum.Green);
        ColorfulThing black = new ColorfulThing(ColorfulThing.ColorEnum.Black);
        ColorfulThing yellow = new ColorfulThing(ColorfulThing.ColorEnum.Yellow);
        ColorfulThing brown = new ColorfulThing(ColorfulThing.ColorEnum.Brown);


        System.out.println(red.getColor());                                               //object name and getter
        System.out.println(green.getColor());
        System.out.println(black.getColor());
        System.out.println(yellow.getColor());
        System.out.println(brown.getColor());
    }
}


    class ColorfulThing {                                                       //colorfulThing constructor


        public enum ColorEnum {                                                //enum type called Color which has five options
            Red, Green, Black, Yellow, Brown
        }


        private ColorEnum color;                                                 //this var is an instance because it belongs to the class

         ColorfulThing(ColorEnum color) {
            this.color = color;                                                //local var

        }



        public ColorEnum getColor() {                               //the color will be returned in the form of a string

             return color;
        }

    }


class BoringThing {                                                  //package level class (unused so far)

}



