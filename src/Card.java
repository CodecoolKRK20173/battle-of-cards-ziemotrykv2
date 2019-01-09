class Card {
    String name;
    int strength;
    int typingSpeed;
    int punchPower;
    int brainPower;
    int funnyMeter;
    int anger;
    int demotivation;

    Card(String name, int strength, int typingSpeed, int punchPower, int brainPower,
    int funnyMeter, int anger, int demotivation) {
        this.name = name;
        this.strength = strength;
        this.typingSpeed = typingSpeed;
        this.punchPower = punchPower;
        this.brainPower = brainPower;
        this.funnyMeter = funnyMeter;
        this.anger = anger;
        this.demotivation = demotivation;
    }

    public String toString(int) {
        return Integer.toString(int);
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTypingSpeed() {
        return typingSpeed;
    }

    public int getPunchPower() {
        return getPunchPower;
    }

    public int getBrainPower() {
        return getBrainPower;
    }

    public int getFunnyMeter() {
        return funnyMeter;
    }

    public int getAnger() {
        return anger;
    }

    public int getDemotivation() {
        return demotivation;
    }

    public int getStatByString(String stat) {
        switch (stat) {
            case 1: return getStrength();
                    break;
            case 2: return getTypingSpeed();
                    break;
            case 3: return getPunchPower();
                    break;
            case 4: return getBrainPower();
                    break;
            case 5: return getFunnyMeter();
                    break;
            case 6: return getAnger();
                    break;
            case 7: return getDemotivation();
                    break;

        }
    }
}
