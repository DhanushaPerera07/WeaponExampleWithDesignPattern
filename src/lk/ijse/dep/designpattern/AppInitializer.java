/**
 * MIT License
 * <p>
 * Copyright (c) 2021 Dhanusha Perera
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * @author : Dhanusha Perera
 * @since : 09/03/2021
 **/
/**
 * @author : Dhanusha Perera
 * @since : 09/03/2021
 **/
package lk.ijse.dep.designpattern;

import lk.ijse.dep.designpattern.entity.DesertEagle;
import lk.ijse.dep.designpattern.entity.Player;
import lk.ijse.dep.designpattern.entity.SniperRifle;

public class AppInitializer {
    public static void main(String[] args) {
        DesertEagle desertEagle = new DesertEagle("Desert Eagle",5);
        SniperRifle sniperRifle = new SniperRifle("Sniper Rifle",5);

        Player player = new Player("Lucky Kaldera",desertEagle);
        System.out.println("After Desert Eagle sniper rifle ------------------------------------------");
        player.action();

        System.out.println("After Setting up sniper rifle ------------------------------------------");
        player.setWeapon(sniperRifle);
        player.action();
    }
}
