package com.ray3k.template;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextTooltip;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.AnimationStateData;
import com.esotericsoftware.spine.SkeletonData;
import java.lang.String;

public class Resources {
    public static TextureAtlas textures_textures;

    public static Skin skin_skin;

    public static Sound sfx_assault;

    public static Sound sfx_bing;

    public static Sound sfx_buildingDestroyed;

    public static Sound sfx_click;

    public static Sound sfx_coin;

    public static Sound sfx_commanderYourBaseIsUnderAttack;

    public static Sound sfx_explosion2;

    public static Sound sfx_explosion3;

    public static Sound sfx_explosion;

    public static Sound sfx_failure;

    public static Sound sfx_femaleDeath;

    public static Sound sfx_launcher;

    public static Sound sfx_libgdxBeep;

    public static Sound sfx_libgdxBurstFire;

    public static Sound sfx_libgdxExplosion;

    public static Sound sfx_libgdxMadeWithUnity;

    public static Sound sfx_libgdxScream;

    public static Sound sfx_missile;

    public static Sound sfx_missionFailure;

    public static Sound sfx_mortar;

    public static Sound sfx_pouncer;

    public static Sound sfx_ray3kItsInTheGame;

    public static Sound sfx_ray3kRay3k;

    public static Sound sfx_reinforcementsHaveArrived;

    public static Sound sfx_sniper;

    public static Sound sfx_spit;

    public static Sound sfx_tank;

    public static Sound sfx_troopDeploy;

    public static Sound sfx_victory;

    public static Sound sfx_witch;

    public static Sound sfx_zombieDeath;

    public static Sound sfx_zombieGargle;

    public static Sound sfx_zombieGrowl;

    public static Sound sfx_zombieRally;

    public static Music bgm_audioSample;

    public static Music bgm_game;

    public static Music bgm_menu;

    public static void loadResources(AssetManager assetManager) {
        textures_textures = assetManager.get("textures/textures.atlas");
        SpineActor.skeletonData = assetManager.get("spine/actor.json");
        SpineActor.animationData = assetManager.get("spine/actor.json-animation");
        SpineActor.animationFlag = SpineActor.skeletonData.findAnimation("flag");
        SpineActor.animationShoot = SpineActor.skeletonData.findAnimation("shoot");
        SpineActor.animationWalk = SpineActor.skeletonData.findAnimation("walk");
        SpineActor.skinDefault = SpineActor.skeletonData.findSkin("default");
        SpineActor.skinAssault = SpineActor.skeletonData.findSkin("assault");
        SpineActor.skinExploder = SpineActor.skeletonData.findSkin("exploder");
        SpineActor.skinHeavy = SpineActor.skeletonData.findSkin("heavy");
        SpineActor.skinMilitia = SpineActor.skeletonData.findSkin("militia");
        SpineActor.skinPouncer = SpineActor.skeletonData.findSkin("pouncer");
        SpineActor.skinSniper = SpineActor.skeletonData.findSkin("sniper");
        SpineActor.skinSpitter = SpineActor.skeletonData.findSkin("spitter");
        SpineActor.skinWitch = SpineActor.skeletonData.findSkin("witch");
        SpineActor.skinZombie = SpineActor.skeletonData.findSkin("zombie");
        SpineBloodCloud.skeletonData = assetManager.get("spine/blood-cloud.json");
        SpineBloodCloud.animationData = assetManager.get("spine/blood-cloud.json-animation");
        SpineBloodCloud.animationAnimation = SpineBloodCloud.skeletonData.findAnimation("animation");
        SpineBloodCloud.skinDefault = SpineBloodCloud.skeletonData.findSkin("default");
        SpineBloodSplatter.skeletonData = assetManager.get("spine/blood-splatter.json");
        SpineBloodSplatter.animationData = assetManager.get("spine/blood-splatter.json-animation");
        SpineBloodSplatter.animationAnimation = SpineBloodSplatter.skeletonData.findAnimation("animation");
        SpineBloodSplatter.skinDefault = SpineBloodSplatter.skeletonData.findSkin("default");
        SpineBomb.skeletonData = assetManager.get("spine/bomb.json");
        SpineBomb.animationData = assetManager.get("spine/bomb.json-animation");
        SpineBomb.animationAnimation = SpineBomb.skeletonData.findAnimation("animation");
        SpineBomb.skinDefault = SpineBomb.skeletonData.findSkin("default");
        SpineCoin.skeletonData = assetManager.get("spine/coin.json");
        SpineCoin.animationData = assetManager.get("spine/coin.json-animation");
        SpineCoin.animationAnimation = SpineCoin.skeletonData.findAnimation("animation");
        SpineCoin.skinDefault = SpineCoin.skeletonData.findSkin("default");
        SpineExplosion.skeletonData = assetManager.get("spine/explosion.json");
        SpineExplosion.animationData = assetManager.get("spine/explosion.json-animation");
        SpineExplosion.animationAnimation = SpineExplosion.skeletonData.findAnimation("animation");
        SpineExplosion.skinDefault = SpineExplosion.skeletonData.findSkin("default");
        SpineHouse.skeletonData = assetManager.get("spine/house.json");
        SpineHouse.animationData = assetManager.get("spine/house.json-animation");
        SpineHouse.animationAlive = SpineHouse.skeletonData.findAnimation("alive");
        SpineHouse.animationDestroyed = SpineHouse.skeletonData.findAnimation("destroyed");
        SpineHouse.skinHouse1 = SpineHouse.skeletonData.findSkin("house-1");
        SpineHouse.skinHouse2 = SpineHouse.skeletonData.findSkin("house-2");
        SpineLibgdx.skeletonData = assetManager.get("spine/libgdx.json");
        SpineLibgdx.animationData = assetManager.get("spine/libgdx.json-animation");
        SpineLibgdx.animationAnimation = SpineLibgdx.skeletonData.findAnimation("animation");
        SpineLibgdx.animationStand = SpineLibgdx.skeletonData.findAnimation("stand");
        SpineLibgdx.skinDefault = SpineLibgdx.skeletonData.findSkin("default");
        SpineMissile.skeletonData = assetManager.get("spine/missile.json");
        SpineMissile.animationData = assetManager.get("spine/missile.json-animation");
        SpineMissile.animationAnimation = SpineMissile.skeletonData.findAnimation("animation");
        SpineMissile.skinDefault = SpineMissile.skeletonData.findSkin("default");
        SpinePoisonCloud.skeletonData = assetManager.get("spine/poison-cloud.json");
        SpinePoisonCloud.animationData = assetManager.get("spine/poison-cloud.json-animation");
        SpinePoisonCloud.animationAnimation = SpinePoisonCloud.skeletonData.findAnimation("animation");
        SpinePoisonCloud.skinDefault = SpinePoisonCloud.skeletonData.findSkin("default");
        SpineRay3k.skeletonData = assetManager.get("spine/ray3k.json");
        SpineRay3k.animationData = assetManager.get("spine/ray3k.json-animation");
        SpineRay3k.animationAnimation = SpineRay3k.skeletonData.findAnimation("animation");
        SpineRay3k.animationStand = SpineRay3k.skeletonData.findAnimation("stand");
        SpineRay3k.skinDefault = SpineRay3k.skeletonData.findSkin("default");
        SpineShip.skeletonData = assetManager.get("spine/ship.json");
        SpineShip.animationData = assetManager.get("spine/ship.json-animation");
        SpineShip.animationAnimation = SpineShip.skeletonData.findAnimation("animation");
        SpineShip.skinDefault = SpineShip.skeletonData.findSkin("default");
        SpineSmoke.skeletonData = assetManager.get("spine/smoke.json");
        SpineSmoke.animationData = assetManager.get("spine/smoke.json-animation");
        SpineSmoke.animationAnimation = SpineSmoke.skeletonData.findAnimation("animation");
        SpineSmoke.skinDefault = SpineSmoke.skeletonData.findSkin("default");
        SpineSpit.skeletonData = assetManager.get("spine/spit.json");
        SpineSpit.animationData = assetManager.get("spine/spit.json-animation");
        SpineSpit.animationAnimation = SpineSpit.skeletonData.findAnimation("animation");
        SpineSpit.skinDefault = SpineSpit.skeletonData.findSkin("default");
        SpineThrusterSmall.skeletonData = assetManager.get("spine/thruster-small.json");
        SpineThrusterSmall.animationData = assetManager.get("spine/thruster-small.json-animation");
        SpineThrusterSmall.animationAnimation = SpineThrusterSmall.skeletonData.findAnimation("animation");
        SpineThrusterSmall.skinDefault = SpineThrusterSmall.skeletonData.findSkin("default");
        SpineThruster.skeletonData = assetManager.get("spine/thruster.json");
        SpineThruster.animationData = assetManager.get("spine/thruster.json-animation");
        SpineThruster.animationAnimation = SpineThruster.skeletonData.findAnimation("animation");
        SpineThruster.skinDefault = SpineThruster.skeletonData.findSkin("default");
        skin_skin = assetManager.get("skin/skin.json");
        SkinSkinStyles.ibLevel8 = skin_skin.get("level-8", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibOptions = skin_skin.get("options", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel13 = skin_skin.get("level-13", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibDefaults = skin_skin.get("defaults", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel5 = skin_skin.get("level-5", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibDefault = skin_skin.get("default", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibMortar = skin_skin.get("mortar", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel10 = skin_skin.get("level-10", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel2 = skin_skin.get("level-2", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibMine = skin_skin.get("mine", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel15 = skin_skin.get("level-15", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel7 = skin_skin.get("level-7", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibAssault = skin_skin.get("assault", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibSniper = skin_skin.get("sniper", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel12 = skin_skin.get("level-12", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibBomb = skin_skin.get("bomb", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel4 = skin_skin.get("level-4", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibMilitia = skin_skin.get("militia", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel9 = skin_skin.get("level-9", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel1 = skin_skin.get("level-1", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel14 = skin_skin.get("level-14", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibOk = skin_skin.get("ok", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel6 = skin_skin.get("level-6", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel11 = skin_skin.get("level-11", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibHeavy = skin_skin.get("heavy", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibCredits = skin_skin.get("credits", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibLevel3 = skin_skin.get("level-3", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibPlay = skin_skin.get("play", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.ibBindings = skin_skin.get("bindings", ImageButton.ImageButtonStyle.class);
        SkinSkinStyles.lDefault = skin_skin.get("default", Label.LabelStyle.class);
        SkinSkinStyles.spDefault = skin_skin.get("default", ScrollPane.ScrollPaneStyle.class);
        SkinSkinStyles.sDefaultHorizontal = skin_skin.get("default-horizontal", Slider.SliderStyle.class);
        SkinSkinStyles.tbDefault = skin_skin.get("default", TextButton.TextButtonStyle.class);
        SkinSkinStyles.ttDefault = skin_skin.get("default", TextTooltip.TextTooltipStyle.class);
        SkinSkinStyles.wDefault = skin_skin.get("default", Window.WindowStyle.class);
        sfx_assault = assetManager.get("sfx/assault.mp3");
        sfx_bing = assetManager.get("sfx/bing.mp3");
        sfx_buildingDestroyed = assetManager.get("sfx/building-destroyed.mp3");
        sfx_click = assetManager.get("sfx/click.mp3");
        sfx_coin = assetManager.get("sfx/coin.mp3");
        sfx_commanderYourBaseIsUnderAttack = assetManager.get("sfx/commander-your-base-is-under-attack.mp3");
        sfx_explosion2 = assetManager.get("sfx/explosion-2.mp3");
        sfx_explosion3 = assetManager.get("sfx/explosion-3.mp3");
        sfx_explosion = assetManager.get("sfx/explosion.mp3");
        sfx_failure = assetManager.get("sfx/failure.mp3");
        sfx_femaleDeath = assetManager.get("sfx/female-death.mp3");
        sfx_launcher = assetManager.get("sfx/launcher.mp3");
        sfx_libgdxBeep = assetManager.get("sfx/libgdx-beep.mp3");
        sfx_libgdxBurstFire = assetManager.get("sfx/libgdx-burst-fire.mp3");
        sfx_libgdxExplosion = assetManager.get("sfx/libgdx-explosion.mp3");
        sfx_libgdxMadeWithUnity = assetManager.get("sfx/libgdx-made-with-unity.mp3");
        sfx_libgdxScream = assetManager.get("sfx/libgdx-scream.mp3");
        sfx_missile = assetManager.get("sfx/missile.mp3");
        sfx_missionFailure = assetManager.get("sfx/mission-failure.mp3");
        sfx_mortar = assetManager.get("sfx/mortar.mp3");
        sfx_pouncer = assetManager.get("sfx/pouncer.mp3");
        sfx_ray3kItsInTheGame = assetManager.get("sfx/ray3k-it's-in-the-game.mp3");
        sfx_ray3kRay3k = assetManager.get("sfx/ray3k-ray3k.mp3");
        sfx_reinforcementsHaveArrived = assetManager.get("sfx/reinforcements-have-arrived.mp3");
        sfx_sniper = assetManager.get("sfx/sniper.mp3");
        sfx_spit = assetManager.get("sfx/spit.mp3");
        sfx_tank = assetManager.get("sfx/tank.mp3");
        sfx_troopDeploy = assetManager.get("sfx/troop-deploy.mp3");
        sfx_victory = assetManager.get("sfx/victory.mp3");
        sfx_witch = assetManager.get("sfx/witch.mp3");
        sfx_zombieDeath = assetManager.get("sfx/zombie death.mp3");
        sfx_zombieGargle = assetManager.get("sfx/zombie gargle.mp3");
        sfx_zombieGrowl = assetManager.get("sfx/zombie-growl.mp3");
        sfx_zombieRally = assetManager.get("sfx/zombie-rally.mp3");
        bgm_audioSample = assetManager.get("bgm/audio-sample.ogg");
        bgm_game = assetManager.get("bgm/game.ogg");
        bgm_menu = assetManager.get("bgm/menu.ogg");
    }

    public static class SpineActor {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationFlag;

        public static Animation animationShoot;

        public static Animation animationWalk;

        public static com.esotericsoftware.spine.Skin skinDefault;

        public static com.esotericsoftware.spine.Skin skinAssault;

        public static com.esotericsoftware.spine.Skin skinExploder;

        public static com.esotericsoftware.spine.Skin skinHeavy;

        public static com.esotericsoftware.spine.Skin skinMilitia;

        public static com.esotericsoftware.spine.Skin skinPouncer;

        public static com.esotericsoftware.spine.Skin skinSniper;

        public static com.esotericsoftware.spine.Skin skinSpitter;

        public static com.esotericsoftware.spine.Skin skinWitch;

        public static com.esotericsoftware.spine.Skin skinZombie;
    }

    public static class SpineBloodCloud {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineBloodSplatter {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineBomb {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineCoin {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineExplosion {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineHouse {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAlive;

        public static Animation animationDestroyed;

        public static com.esotericsoftware.spine.Skin skinHouse1;

        public static com.esotericsoftware.spine.Skin skinHouse2;
    }

    public static class SpineLibgdx {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationStand;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineMissile {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpinePoisonCloud {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineRay3k {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationStand;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineShip {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineSmoke {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineSpit {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineThrusterSmall {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineThruster {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SkinSkinStyles {
        public static ImageButton.ImageButtonStyle ibLevel8;

        public static ImageButton.ImageButtonStyle ibOptions;

        public static ImageButton.ImageButtonStyle ibLevel13;

        public static ImageButton.ImageButtonStyle ibDefaults;

        public static ImageButton.ImageButtonStyle ibLevel5;

        public static ImageButton.ImageButtonStyle ibDefault;

        public static ImageButton.ImageButtonStyle ibMortar;

        public static ImageButton.ImageButtonStyle ibLevel10;

        public static ImageButton.ImageButtonStyle ibLevel2;

        public static ImageButton.ImageButtonStyle ibMine;

        public static ImageButton.ImageButtonStyle ibLevel15;

        public static ImageButton.ImageButtonStyle ibLevel7;

        public static ImageButton.ImageButtonStyle ibAssault;

        public static ImageButton.ImageButtonStyle ibSniper;

        public static ImageButton.ImageButtonStyle ibLevel12;

        public static ImageButton.ImageButtonStyle ibBomb;

        public static ImageButton.ImageButtonStyle ibLevel4;

        public static ImageButton.ImageButtonStyle ibMilitia;

        public static ImageButton.ImageButtonStyle ibLevel9;

        public static ImageButton.ImageButtonStyle ibLevel1;

        public static ImageButton.ImageButtonStyle ibLevel14;

        public static ImageButton.ImageButtonStyle ibOk;

        public static ImageButton.ImageButtonStyle ibLevel6;

        public static ImageButton.ImageButtonStyle ibLevel11;

        public static ImageButton.ImageButtonStyle ibHeavy;

        public static ImageButton.ImageButtonStyle ibCredits;

        public static ImageButton.ImageButtonStyle ibLevel3;

        public static ImageButton.ImageButtonStyle ibPlay;

        public static ImageButton.ImageButtonStyle ibBindings;

        public static Label.LabelStyle lDefault;

        public static ScrollPane.ScrollPaneStyle spDefault;

        public static Slider.SliderStyle sDefaultHorizontal;

        public static TextButton.TextButtonStyle tbDefault;

        public static TextTooltip.TextTooltipStyle ttDefault;

        public static Window.WindowStyle wDefault;
    }

    public static class Values {
        public static float jumpVelocity = 10.0f;

        public static String name = "Raeleus";

        public static boolean godMode = true;

        public static int id = 10;

        public static Range speedLimitRange = new Range(0.0f, 10.0f);

        public static float speedLimit = 5.0f;
    }

    public static class Range {
        public float min;

        public float max;

        Range(float min, float max) {
            this.min = min;
            this.max = max;
        }
    }
}
