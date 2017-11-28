package ru.neolab.forest.flora;

/**
 * ������� ������� 102� ���������� �� �����, �������� � ������ 50�.
 * � 100� ���������� ���������� ������� 300-320����
 */
public class Hare extends Beast {
    public Hare() {
        super();
    }

    @Override
    protected Beast getChildren() {
        return new Hare();
    }

    @Override
    public double getNeededKilocaloriesAmount() {
        return Math.max(0, (1 - getHunger()) * 300);
    }
}
