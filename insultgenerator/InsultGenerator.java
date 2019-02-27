/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insultgenerator;
import java.util.Random;
/**
 *
 * @author david.kanat
 */
public class InsultGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        insultZero();
	}
    
    static void insultZero(){
        
                Random r = new Random();
        
        		//column 1
                 String[] word_1 = {
               
        "artless ", "bawdy ", "beslubbering ", "bootless ",

        "churlish ", "cockered ","clouted ", "craven ",

        "currish ", "dankish ", "dissembling ", "droning ",

        "errant ", "fawning ", "fobbing ", "froward ",

        "frothy ",  "gleeking ", "goatish ", "gorbellied ",

        "impertinent ",  "infectious ", "jarring ", "loggerheaded ",

        "lumpish ", "mammering ", "mangled ", "mewling ",

        "paunchy", "pribbling ", "puking ", "puny ",

        "qualling ", "rank ", "reeky ", "roguish ",

        "ruttish ", "saucy ", "spleeny ","spongy ",

        "surly ", "tottering ", "unmuzzled ", "vain ",

        "venomed ", "villainous ", "warped ", "wayward ",

        "weedy ", "yeasty "

    };
		int choice1 = r.nextInt(word_1.length);
		String response1 = word_1[choice1];
                

                 
                 
    String[] word_2 = {
        
        "base-court ", "bat-fowling ", "beef-witted ", "beetle-headed ",

        "clapper-clawed ", "clay-brained ", "common-kissing ", "crook-pated ",

        "dismal-dreaming ", "dizzy-eyed ", "doghearted ", "dread-bolted ",

        "earth-vexing ", "elf-skinned ", "fat-kidneyed ", "fen-sucked ",

        "flap-mouthed ", "fly-bitten ", "folly-fallen ", "fool-born ",

        "full-gorged ", "guts-griping ", "half-faced ", "hasty-witted ",

        "hedge-born ", "hell-hated ", "idle-headed ", "ill-breeding ",

        "ill-nutured ", "knotty-pated ", "milk-livered ", "motley-minded ",

        "onion-eyed ", "plume-plucked ", "pottle-deep ", "pox-marked ",

        "reeling-ripe ", "rough-hewn ", "rude-growing ", "rump-fed ",

        "shard-borne ", "sheep-biting ", "spur-galled ", "swag-bellied ",

        "tardy-gaited ", "tickle-brained ", "toad-spotted ", "unchin-snouted ",

        "weather-bitten ", "boil-brained "
    };

    		int choice2 = r.nextInt(word_2.length);
		String response2 = word_2[choice2];
                
                
    
      String[] word_3 = {

          "apple-john", "baggage", "barnacle", "bladder",

        "boar-pig", "bugbear", "bum-bailey", "canker-blossom",

        "clack-dish", "clotpole", "coxcomb", "codpiece",

        "death-token", "dewberry", "flap-dragon", "flax-wench",

        "flirt-gill", "foot-licker", "fustilarian", "giglet",

        "gudgeon", "haggard", "harpy", "hedge-pig",

         "horn-beast", "hugger-mugger", "joithead",

        "lewdster", "lout", "maggot-pie", "malt-worm",

        "mammet", "measle", "minnow", "miscreant",

        "mold-warp", "mumble-news", "nut-hook",  "piegon egg",

        "pignut", "puttock", "pumpion", "ratsbane",

        "scut", "skainsmate", "strumpet", "varlot",

        "vassal", "whey-face","wagtail"
    };   
                
      		int choice3 = r.nextInt(word_3.length);
		String response3 = word_3[choice3];
                
             


		System.out.println("Thou " + response1 + response2 + response3);
        
    }
    
}
