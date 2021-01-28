package GCU.lab_1.dice;


    class DiceV1 implements IDice {



        private int die1Value;
        private int die2Value;

        private int randInt() {
            int num = (int)(Math.random()*6)+1;
            return num;
        }

        @Override
        public int roll() {
            die1Value = randInt();
            die2Value = randInt();
            return die1Value + die2Value;
        }

        @Override
        public int die1() {

            return die1Value;
        }

        @Override
        public int die2() {

            return die2Value;
        }
    }

