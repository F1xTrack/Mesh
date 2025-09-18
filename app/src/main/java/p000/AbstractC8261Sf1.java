package p000;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;

/* renamed from: Sf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8261Sf1 {

    /* renamed from: a */
    public static final C1380Vw f10892a;

    /* renamed from: b */
    public static final C1380Vw f10893b;

    /* renamed from: c */
    public static final C1380Vw f10894c;

    /* renamed from: d */
    public static final C1380Vw f10895d;

    /* renamed from: e */
    public static final C1380Vw f10896e;

    /* renamed from: f */
    public static final C1380Vw f10897f;

    static {
        C1380Vw c1380Vw = new C1380Vw();
        c1380Vw.put("ca", "calendar");
        c1380Vw.put("nu", "numbers");
        c1380Vw.put("hc", "hours");
        c1380Vw.put("co", "collation");
        c1380Vw.put("kn", "colnumeric");
        c1380Vw.put("kf", "colcasefirst");
        f10892a = c1380Vw;
        C1380Vw c1380Vw2 = new C1380Vw();
        c1380Vw2.put("calendar", "ca");
        c1380Vw2.put("numbers", "nu");
        c1380Vw2.put("hours", "hc");
        c1380Vw2.put("collation", "co");
        c1380Vw2.put("colnumeric", "kn");
        c1380Vw2.put("colcasefirst", "kf");
        f10893b = c1380Vw2;
        C1380Vw c1380Vw3 = new C1380Vw();
        c1380Vw3.put("dictionary", "dict");
        c1380Vw3.put("phonebook", "phonebk");
        c1380Vw3.put("traditional", "trad");
        c1380Vw3.put("gb2312han", "gb2312");
        f10894c = c1380Vw3;
        C1380Vw c1380Vw4 = new C1380Vw();
        c1380Vw4.put("gregorian", "gregory");
        f10895d = c1380Vw4;
        C1380Vw c1380Vw5 = new C1380Vw();
        c1380Vw5.put("traditional", "traditio");
        f10896e = c1380Vw5;
        C1380Vw c1380Vw6 = new C1380Vw();
        c1380Vw6.put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
        c1380Vw6.put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
        c1380Vw6.put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        f10897f = c1380Vw6;
    }

    /* renamed from: a */
    public static boolean m7410a(String str, String str2, Y40 y40) {
        if (Build.VERSION.SDK_INT < 24) {
            C1380Vw c1380Vw = f10897f;
            if (c1380Vw.containsKey(str)) {
                return Arrays.asList((String[]) c1380Vw.get(str)).contains(str2);
            }
            return true;
        }
        ULocale uLocaleM4845i = L10.m4845i(y40.mo5826g());
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = RuleBasedCollator.getKeywordValuesForLocale("co", uLocaleM4845i, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocaleM4845i, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    /* renamed from: b */
    public static String m7411b(String str) {
        C1380Vw c1380Vw = f10894c;
        return !c1380Vw.containsKey(str) ? str : (String) c1380Vw.get(str);
    }

    /* renamed from: c */
    public static Object m7412c(Object obj, String str) {
        if (str.equals("ca") && (obj instanceof String)) {
            String str2 = (String) obj;
            C1380Vw c1380Vw = f10895d;
            return !c1380Vw.containsKey(str2) ? str2 : (String) c1380Vw.get(str2);
        }
        if (!str.equals("nu") || !(obj instanceof String)) {
            return (str.equals("co") && (obj instanceof String)) ? m7411b((String) obj) : (str.equals("kn") && (obj instanceof String) && obj.equals("yes")) ? "true" : ((str.equals("kn") || str.equals("kf")) && (obj instanceof String) && obj.equals("no")) ? "false" : obj;
        }
        String str3 = (String) obj;
        C1380Vw c1380Vw2 = f10896e;
        return !c1380Vw2.containsKey(str3) ? str3 : (String) c1380Vw2.get(str3);
    }
}
