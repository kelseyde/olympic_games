package com.example.kelseyde.olympicgames;
import com.example.kelseyde.olympicgames.Competitors.Athlete;
import com.example.kelseyde.olympicgames.Competitors.*;
import com.example.kelseyde.olympicgames.Events.*;
import com.example.kelseyde.olympicgames.Events.Abstract.Event;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static com.example.kelseyde.olympicgames.Competitors.Nationality.*;
import static com.example.kelseyde.olympicgames.Competitors.Sport.*;
import static org.junit.Assert.*;

public class FootballEventTest {

    Athlete a1; Athlete a2; Athlete a3; Athlete a4; Athlete a5; Athlete a6; Athlete a7; Athlete a8;
    Athlete a9; Athlete a10; Athlete a11; Athlete a12; Athlete a13; Athlete a14; Athlete a15; Athlete a16;
    Athlete a17; Athlete a18; Athlete a19; Athlete a20; Athlete a21; Athlete a22; Athlete a23; Athlete a24;
    Athlete a25; Athlete a26; Athlete a27; Athlete a28; Athlete a29; Athlete a30; Athlete a31; Athlete a32;
    Athlete a33; Athlete a34; Athlete a35; Athlete a36; Athlete a37; Athlete a38; Athlete a39; Athlete a40;
    Athlete a41; Athlete a42; Athlete a43; Athlete a44; Athlete a45; Athlete a46; Athlete a47; Athlete a48;
    Athlete a49; Athlete a50; Athlete a51; Athlete a52; Athlete a53; Athlete a54; Athlete a55; Athlete a56;
    Athlete a57; Athlete a58; Athlete a59; Athlete a60; Athlete a61; Athlete a62; Athlete a63; Athlete a64;
    Athlete a65; Athlete a66; Athlete a67; Athlete a68; Athlete a69; Athlete a70; Athlete a71; Athlete a72;
    Athlete a73; Athlete a74; Athlete a75; Athlete a76; Athlete a77; Athlete a78; Athlete a79; Athlete a80;
    Athlete a81; Athlete a82; Athlete a83; Athlete a84; Athlete a85; Athlete a86; Athlete a87; Athlete a88;
    Team t1; Team t2; Team t3; Team t4; Team t5; Team t6; Team t7; Team t8;
    FootballEvent e1;

    @Before
    public void before() {
        a1 = new Athlete("Neuer", GERMANY, FOOTBALL, 10);
        a2 = new Athlete("Lahm", GERMANY, FOOTBALL, 10);
        a3 = new Athlete("Boateng", GERMANY, FOOTBALL, 10);
        a4 = new Athlete("Hummels", GERMANY, FOOTBALL, 10);
        a5 = new Athlete("Durm", GERMANY, FOOTBALL, 10);
        a6 = new Athlete("Schweinsteiger", GERMANY, FOOTBALL, 10);
        a7 = new Athlete("Kroos", GERMANY, FOOTBALL, 10);
        a8 = new Athlete("Sane", GERMANY, FOOTBALL, 10);
        a9 = new Athlete("Ozil", GERMANY, FOOTBALL, 10);
        a10 = new Athlete("Reus", GERMANY, FOOTBALL, 10);
        a11 = new Athlete("Muller", GERMANY, FOOTBALL, 10);
        t1 = new Team("Germany", GERMANY, FOOTBALL);
        t1.addAthlete(a1);
        t1.addAthlete(a2);
        t1.addAthlete(a3);
        t1.addAthlete(a4);
        t1.addAthlete(a5);
        t1.addAthlete(a6);
        t1.addAthlete(a7);
        t1.addAthlete(a8);
        t1.addAthlete(a9);
        t1.addAthlete(a10);
        t1.addAthlete(a11);

        a12 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a13 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a14 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a15 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a16 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a17 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a18 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a19 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a20 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a21 = new Athlete("A", FRANCE, FOOTBALL, 8);
        a22 = new Athlete("A", FRANCE, FOOTBALL, 8);
        t2 = new Team("France", FRANCE, FOOTBALL);
        t2.addAthlete(a12);
        t2.addAthlete(a13);
        t2.addAthlete(a14);
        t2.addAthlete(a15);
        t2.addAthlete(a16);
        t2.addAthlete(a17);
        t2.addAthlete(a18);
        t2.addAthlete(a19);
        t2.addAthlete(a20);
        t2.addAthlete(a21);
        t2.addAthlete(a22);

        a23 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a24 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a25 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a26 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a27 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a28 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a29 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a30 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a31 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a32 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        a33 = new Athlete("B", JAMAICA, FOOTBALL, 4);
        t3 = new Team("Jamaica", JAMAICA, FOOTBALL);
        t3.addAthlete(a23);
        t3.addAthlete(a24);
        t3.addAthlete(a25);
        t3.addAthlete(a26);
        t3.addAthlete(a27);
        t3.addAthlete(a28);
        t3.addAthlete(a29);
        t3.addAthlete(a30);
        t3.addAthlete(a31);
        t3.addAthlete(a32);
        t3.addAthlete(a33);


        a34 = new Athlete("C", CHINA, FOOTBALL, 3);
        a35 = new Athlete("C", CHINA, FOOTBALL, 3);
        a36 = new Athlete("C", CHINA, FOOTBALL, 3);
        a37 = new Athlete("C", CHINA, FOOTBALL, 3);
        a38 = new Athlete("C", CHINA, FOOTBALL, 3);
        a39 = new Athlete("C", CHINA, FOOTBALL, 3);
        a40 = new Athlete("C", CHINA, FOOTBALL, 3);
        a41 = new Athlete("C", CHINA, FOOTBALL, 3);
        a42 = new Athlete("C", CHINA, FOOTBALL, 3);
        a43 = new Athlete("C", CHINA, FOOTBALL, 3);
        a44 = new Athlete("C", CHINA, FOOTBALL, 3);
        t4 = new Team("China", CHINA, FOOTBALL);
        t4.addAthlete(a34);
        t4.addAthlete(a35);
        t4.addAthlete(a36);
        t4.addAthlete(a37);
        t4.addAthlete(a38);
        t4.addAthlete(a39);
        t4.addAthlete(a40);
        t4.addAthlete(a41);
        t4.addAthlete(a42);
        t4.addAthlete(a43);
        t4.addAthlete(a44);

        a45 = new Athlete("D", USA, FOOTBALL, 5);
        a46 = new Athlete("D", USA, FOOTBALL, 5);
        a47 = new Athlete("D", USA, FOOTBALL, 5);
        a48 = new Athlete("D", USA, FOOTBALL, 5);
        a49 = new Athlete("D", USA, FOOTBALL, 5);
        a50 = new Athlete("D", USA, FOOTBALL, 5);
        a51 = new Athlete("D", USA, FOOTBALL, 5);
        a52 = new Athlete("D", USA, FOOTBALL, 5);
        a53 = new Athlete("D", USA, FOOTBALL, 5);
        a54 = new Athlete("D", USA, FOOTBALL, 5);
        a55 = new Athlete("D", USA, FOOTBALL, 5);
        t5 = new Team("USA", USA, FOOTBALL);
        t5.addAthlete(a45);
        t5.addAthlete(a46);
        t5.addAthlete(a47);
        t5.addAthlete(a48);
        t5.addAthlete(a49);
        t5.addAthlete(a50);
        t5.addAthlete(a51);
        t5.addAthlete(a52);
        t5.addAthlete(a53);
        t5.addAthlete(a54);
        t5.addAthlete(a55);

        a56 = new Athlete("UK", UK, FOOTBALL, 7);
        a57 = new Athlete("UK", UK, FOOTBALL, 7);
        a58 = new Athlete("UK", UK, FOOTBALL, 7);
        a59 = new Athlete("UK", UK, FOOTBALL, 7);
        a60 = new Athlete("UK", UK, FOOTBALL, 7);
        a61 = new Athlete("UK", UK, FOOTBALL, 7);
        a62 = new Athlete("UK", UK, FOOTBALL, 7);
        a63 = new Athlete("UK", UK, FOOTBALL, 7);
        a64 = new Athlete("UK", UK, FOOTBALL, 7);
        a65 = new Athlete("UK", UK, FOOTBALL, 7);
        a66 = new Athlete("UK", UK, FOOTBALL, 7);
        t6 = new Team("UK", UK, FOOTBALL);
        t6.addAthlete(a56);
        t6.addAthlete(a57);
        t6.addAthlete(a58);
        t6.addAthlete(a59);
        t6.addAthlete(a60);
        t6.addAthlete(a61);
        t6.addAthlete(a62);
        t6.addAthlete(a63);
        t6.addAthlete(a64);
        t6.addAthlete(a65);
        t6.addAthlete(a66);

        a67 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a68 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a69 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a70 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a71 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a72 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a73 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a74 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a75 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a76 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        a77 = new Athlete("Brazil", BRAZIL, FOOTBALL, 9);
        t7 = new Team("Brazil", BRAZIL, FOOTBALL);
        t7.addAthlete(a67);
        t7.addAthlete(a68);
        t7.addAthlete(a69);
        t7.addAthlete(a70);
        t7.addAthlete(a71);
        t7.addAthlete(a72);
        t7.addAthlete(a73);
        t7.addAthlete(a74);
        t7.addAthlete(a75);
        t7.addAthlete(a76);
        t7.addAthlete(a77);

        a78 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a79 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a80 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a81 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a82 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a83 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a84 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a85 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a86 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a87 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        a88 = new Athlete("Russia", RUSSIA, FOOTBALL, 6);
        t8 = new Team("Russia", RUSSIA, FOOTBALL);
        t8.addAthlete(a78);
        t8.addAthlete(a79);
        t8.addAthlete(a80);
        t8.addAthlete(a81);
        t8.addAthlete(a82);
        t8.addAthlete(a83);
        t8.addAthlete(a84);
        t8.addAthlete(a85);
        t8.addAthlete(a86);
        t8.addAthlete(a87);
        t8.addAthlete(a88);

        e1 = new FootballEvent("Men's Football");
        e1.addCompetitor(t1);
        e1.addCompetitor(t2);
        e1.addCompetitor(t3);
        e1.addCompetitor(t4);
        e1.addCompetitor(t5);
        e1.addCompetitor(t6);
        e1.addCompetitor(t7);
        e1.addCompetitor(t8);
    }


    @Test
    public void testPlayCorrectNumberOfMedalists() {
        ArrayList<Competitor> medalWinners = e1.play();
        assertEquals(3, medalWinners.size());
    }

    @Test
    public void testPlayGermanyWinsGold() {
        ArrayList<Competitor> medalWinners = e1.play();
        assertEquals(Nationality.GERMANY, medalWinners.get(0).getNationality());
    }

    @Test
    public void testPlayBrazilWinsSilver() {
        ArrayList<Competitor> medalWinners = e1.play();
        for (Competitor team : medalWinners) {
            System.out.println(team.getNationality().toString());
        }
        assertEquals(Nationality.BRAZIL, medalWinners.get(0).getNationality());
    }

    @Test
    public void testPlayFranceWinsBronze() {
        ArrayList<Competitor> medalWinners = e1.play();
        assertEquals(Nationality.FRANCE, medalWinners.get(0).getNationality());
    }

}