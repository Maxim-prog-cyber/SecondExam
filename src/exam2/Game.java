package exam2;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private static final ArrayList<Node> nodes = new ArrayList<>();


    public static ArrayList<Node> createNodes() {
        nodes.add(new Node("Лисенок", "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. \" Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\" - подумал Лисёнок. Как поступить Лисенку?", "1.Вернуться домой", "2.Отправиться на поиски"));
        nodes.add(new Node("Вернуться домой", "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! Игра завершилась успехом", null, null));
        nodes.add(new Node("Отправиться на поиски", "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.", "1.Попытаться разузнать о Бельчонке у лесных жителей", "2.Искать Бельчонка в одиночку"));
        nodes.add(new Node("Попытаться разузнать о Бельчонке у лесных жителей", "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?", "1.Расспросить Сову", "2.Расспросить Волка"));
        nodes.add(new Node("Искать Бельчонка в одиночку", "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей", null, null));
        nodes.add(new Node("Расспросить Сову", "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.", "1.Поверить Сове и отправиться вглубь леса", "2.Сове не стоит верить -> Искать Бельчонка в одиночку"));
        nodes.add(new Node("Расспросить Волка", "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?", "1.Волк прав -> Вернуться домой", "2.-> Искать Бельчонка в одиночку"));
        nodes.add(new Node("Поверить Сове и отправиться вглубь леса", "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.", "1.Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку", "2.Нужно воспользоваться шансом и раздобыть мёд"));
        nodes.add(new Node("Нужно воспользоваться шансом и раздобыть мёд", "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.", "1.Подождать, вдруг пчёлы улетят", "2.Нужно попытаться выкрасть мёд немедленно"));
        nodes.add(new Node("Подождать, вдруг пчёлы улетят", "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?", "1.Поесть немного и передохнуть", "2.Скорее отнести мёд Медвежонку"));
        nodes.add(new Node("Нужно попытаться выкрасть мёд немедленно", "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей", null, null));
        nodes.add(new Node("Поесть немного и передохнуть", "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей", null, null));
        nodes.add(new Node("Скорее отнести мёд Медвежонку", "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.", "1.Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку", "2.Может быть он прав и Лисёнок просто паникует -> Вернуться домой"));
        return nodes;
    }


    public static int playGame(int startIndexGame, TxtHandler txtHandler) {
        boolean finishGame = true;

        ArrayList<Node> arrayList = createNodes();

        Scanner scanner = new Scanner(System.in);
        System.out.println(arrayList.get(startIndexGame).getText());
        System.out.println(arrayList.get(startIndexGame).getFirstResult());
        System.out.println(arrayList.get(startIndexGame).getSecondResult());
        System.out.println("3.Выйти из игры");


        while (finishGame) {
            int n = scanner.nextInt();
            String result = null;

            if (n == 1) {

                result = arrayList.get(startIndexGame).getFirstResult();
                if (result.contains("Вернуться домой")) {
                    System.out.println(arrayList.get(startIndexGame + 1).getText());
                    finishGame = false;
                    break;
                }

                for (Node node : arrayList) {

                    if (result.contains(node.getHeading())) {
                        System.out.println(node.getText());
                        if (node.getFirstResult() == null && node.getSecondResult() == null) {
                            System.out.println(" Вы проиграли");
                            finishGame = false;
                            break;
                        }
                        System.out.println(node.getFirstResult());
                        System.out.println(node.getSecondResult());
                        System.out.println("3.Выйти из игры");

                        startIndexGame = arrayList.indexOf(node);
                        break;
                    }
                }
            }
            if (n == 2) {

                result = arrayList.get(startIndexGame).getSecondResult();
                if (result.contains("Вернуться домой")) {
                    System.out.println(arrayList.get(startIndexGame + 1).getText());
                    finishGame = false;
                    break;
                }

                for (Node node : arrayList) {
                    if (result.contains(node.getHeading())) {
                        System.out.println(node.getText());
                        if (node.getFirstResult() == null && node.getSecondResult() == null) {
                            System.out.println(" Вы проиграли");

                            finishGame = false;
                            break;
                        }
                        System.out.println(node.getFirstResult());
                        System.out.println(node.getSecondResult());
                        System.out.println("3.Выйти из игры");

                        startIndexGame = arrayList.indexOf(node);
                        break;
                    }
                }
            }
            if (n == 3) {
                System.out.println("4.Сохранить игру?" + "\n" + "5.Не сохранять игру ");
                int answer = scanner.nextInt();
                if (answer == 4) {
                    txtHandler.writeToFile(startIndexGame);
                } else {
                    finishGame = false;
                }
                break;
            }
        }
        return startIndexGame;
    }
}