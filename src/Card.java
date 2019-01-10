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

    public String toString() {
        return "Name: " + name + "\nStrength: " + Integer.toString(strength) +
        "\n Typing speed: " + Integer.toString(typingSpeed) +
        "\n Punch power: " + Integer.toString(punchPower) +
        "\n Brain power: " + Integer.toString(brainPower) +
        "\n Funny meter: " + Integer.toString(funnyMeter) +
        "\n Anger: " + Integer.toString(anger) +
        "\n Demotivation: " + Integer.toString(demotivation);
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
        return punchPower;
    }

    public int getBrainPower() {
        return brainPower;
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

    public int getStatByString(int stat) {
        switch (stat) {
            case 1: return getStrength();
            case 2: return getTypingSpeed();
            case 3: return getPunchPower();
            case 4: return getBrainPower();
            case 5: return getFunnyMeter();
            case 6: return getAnger();
            case 7: return getDemotivation();

        }
        return 0;
    }
}
