package semonster2;

import java.util.HashMap;
import java.util.LinkedList;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  LinkedList<Integer> randomNumberList = new LinkedList<Integer>();

  /**
   * 0~4までの値がランダムに一定数格納されたLinkedLIst
   *
   * @param randomNumberList
   */
  SeMonsterGame(LinkedList<Integer> randomNumberList) {
    this.randomNumberList = randomNumberList;
  }

  /**
   * プレイヤーを追加
   *
   * @param playerName
   */
  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(randomNumberList, playerName));
  }

  void draw(String playerName) {
    Player player = this.playerMap.get(playerName);
    player.drawMonsters();
    System.out.println(player);
  }

}
