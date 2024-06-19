package com.telran.prof.hometask.seaBattle;

import java.util.Scanner;

public class SeaBattleGame {

    private static final int FIELD_LENGTH = 10;
    //Массив кораблей для инициализации, элементы по такому типу {количество_палуб,количество_кораблей}
    private static final int[][] SHIP_DECK_AMOUNT = {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String playerOne = null;
        String playerTwo = null;
        //scanner - name of gamers


        char[][] playerFieldOne = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerFieldTwo = new char[FIELD_LENGTH][FIELD_LENGTH];

        SeaBattleGame seaBattleGame = new SeaBattleGame();
        seaBattleGame.fillPlayerField(playerFieldOne);
        seaBattleGame.fillPlayerField(playerFieldTwo);
        seaBattleGame.startGame(playerOne, playerTwo, playerFieldOne, playerFieldTwo);

    }

    /**
     * Метод запрашивает и расставляет корабли на поле
     */
    private void fillPlayerField(char[][] playerField) {
        //Идем по массиву кораблей
        for (int i = 0; i < SHIP_DECK_AMOUNT.length; i++) {
            //Определяем количество кораблей с определенной палубой
            int shipCount = SHIP_DECK_AMOUNT[i][1];
            //Начинаем расставлять корабли с определенной палубой
            for (int j = 0; j < shipCount; j++) {
                System.out.println("Put " + SHIP_DECK_AMOUNT[i][0] + " deck ship. Left: " + (shipCount - j));

                int result = 1;
                int x = 0;
                int y = 0;
                int direction = 0;
                //Запрашиваем x,y координату на поле с которой будет начинаться наш
                //корабль и направление, куда он будет продолжен по горизонтали или вертикали
                //после этого в этом цикле будет проверено, что расставленный корабль не пересекся
                //с другими и не коснулся никого соседними клетками и если все ок,
                //то можно заполнить поле игрока этим кораблем и вывести в консоль то,
                //как выглядит поле после расстановки корабля. Так будет повторяться для всех кораблей.
                while (result != 0) {
                    System.out.println("Input start x coordinate: ");
                    x = scanner.nextInt();

                    System.out.println("Input start y coordinate: ");
                    y = scanner.nextInt();

                    System.out.println("Input direction of ship: ");
                    System.out.println("1 - horizontal; 2 - vertical;");
                    direction = scanner.nextInt();
                    //Проверяет что корабль распологается корректно и если это так
                    //то возвращает 0 и выходим из этого цикла, что бы отрисовать корабль на поле
                    result = validateCoordinateForShip(playerField, x, y, direction, i);
                }

                int shipDeck = SHIP_DECK_AMOUNT[i][0];
                //Рисуем корабль по горизонтали
                if (direction == 1) {
                    for (int k = 0; k < shipDeck; k++) {
                        playerField[y][x + k] = '=';
                    }
                }
                //Рисуем корабль по вертикали
                if (direction == 2) {
                    for (int k = 0; k < shipDeck; k++) {
                        playerField[y + k][x] = '=';
                    }
                }
                //выводит поле после размещения корабля
                printField(playerField);
            }
        }
    }

    private void printField(char[][] playerField) {
        // print 2D array
        //!!!Дописать логику этого метода
    }

    private void startGame(String playerOne, String playerTwo,
                           char[][] currentPlayerBattleField, char[][] currentPlayerFiled) {
        // Добавим еще два поля, на которых будем отмечать выстрелы
        char[][] playerBattleFieldOne = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleFieldTwo = new char[FIELD_LENGTH][FIELD_LENGTH];
        //Определяем текущего игрока, они будут ходить по очереди
        String currentPlayer = playerOne;
        char[][] currentPlayerField = currentPlayerFiled;
        char[][] currentPlayerEnemyField = playerBattleFieldOne;

        //Игра будет идти, пока один из игроков не потеряет все корабли
        //input shot x,y
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //Обрабатываем выстрел
        //verificationShot(currentPlayerBattleField, currentPlayerFiled, x, y);
        //Если выстрел был не удачный, то присваиваем в переменные текущего игрока, другого игрока
        //и его поле выстрелов и поле противника

        //!!!Дописать логику этого метода


        System.out.println("Winner is ");
    }


    private static void fillFiled(char[][] field) {
        //!!!Дописать логику этого метода
    }

    /**
     * Метод проверяет, что корабль корректно поместится по указанным координатам и не будет
     * соседствовать, в нарушении правил, с другими кораблями
     * если корректно - вернет 0, иначе -1
     */
    private static int validateCoordinateForShip(char[][] field, int x, int y, int direction, int shipDeck) {
        // horizontally
        if (direction == 1) {
            for (int i = 0; i < shipDeck - 1; i++) {
                if (x > 0) {
                    if ('=' == field[y][x + i - 1]) {
                        return -1;
                    }
                }
                if (y > 0) {
                    if ('=' == field[y - 1][x + i]) {
                        return -1;
                    }
                }
                if ('=' == field[y][x + i] || '=' == field[y][x + i + 1] || '=' == field[y + 1][x + i] || (x + i) > 9) {
                    return -1;
                }
            }
        } else if (direction == 2) { // vertically
            for (int i = 0; i < shipDeck - 1; i++) {
                if (y > 0) {
                    if ('=' == field[y + i - 1][x]) {
                        return -1;
                    }
                }
                if (x > 0) {
                    if ('=' == field[y + i][x - 1]) {
                        return -1;
                    }
                }
                if ('=' == field[y + i][x] || '=' == field[y + i + 1][x] || '=' == field[y + i][x + 1] || (y + i) > 9) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /**
     * Метод проверяющий, что по переданным координатам есть корабль и выстрел успешный
     * возвращает 1, если успешный, 0 если промах
     * отмечает выстрелы на поле противника field и на своем поле выстрелов battleField
     */
    private static int verificationShot(char[][] battleField, char[][] field, int x, int y) {
        //!!!Дописать логику этого метода
        //проверить, что на данном поле есть целая палуба корабля, если так,
        //если успех, то отметить подбитую палубу на поле противника field
        //и отметить выстрел на своем поле выстрелов battleField и вернуть 1
        //иначе отметить на своем поле выстрелов battleField промах и вернуть 0

        //временно возвращаю 0, для избежания ошибки компиляции
        return 0;
    }

    /**
     * Метод проверяющий, что у игрока есть хоть одна целая палуба на поле
     */
    private static boolean isPlayerAlive(char[][] field) {
        //!!!Дописать логику этого метода
        //пробежаться по всему полю и вернуть true
        //если есть хотя бы одна палуба на поле целая
        //иначе вернуть false

        //временно возвращаю false, для избежания ошибки компиляции
        return false;
    }
}