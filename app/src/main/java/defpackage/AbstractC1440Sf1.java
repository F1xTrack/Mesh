package defpackage;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;

/* renamed from: Sf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1440Sf1 {
    public static final C1723Vw a;
    public static final C1723Vw b;
    public static final C1723Vw c;
    public static final C1723Vw d;
    public static final C1723Vw e;
    public static final C1723Vw f;

    static {
        C1723Vw c1723Vw = new C1723Vw();
        c1723Vw.put("ca", "calendar");
        c1723Vw.put("nu", "numbers");
        c1723Vw.put("hc", "hours");
        c1723Vw.put("co", "collation");
        c1723Vw.put("kn", "colnumeric");
        c1723Vw.put("kf", "colcasefirst");
        a = c1723Vw;
        C1723Vw c1723Vw2 = new C1723Vw();
        c1723Vw2.put("calendar", "ca");
        c1723Vw2.put("numbers", "nu");
        c1723Vw2.put("hours", "hc");
        c1723Vw2.put("collation", "co");
        c1723Vw2.put("colnumeric", "kn");
        c1723Vw2.put("colcasefirst", "kf");
        b = c1723Vw2;
        C1723Vw c1723Vw3 = new C1723Vw();
        c1723Vw3.put("dictionary", "dict");
        c1723Vw3.put("phonebook", "phonebk");
        c1723Vw3.put("traditional", "trad");
        c1723Vw3.put("gb2312han", "gb2312");
        c = c1723Vw3;
        C1723Vw c1723Vw4 = new C1723Vw();
        c1723Vw4.put("gregorian", "gregory");
        d = c1723Vw4;
        C1723Vw c1723Vw5 = new C1723Vw();
        c1723Vw5.put("traditional", "traditio");
        e = c1723Vw5;
        C1723Vw c1723Vw6 = new C1723Vw();
        c1723Vw6.put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
        c1723Vw6.put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
        c1723Vw6.put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        f = c1723Vw6;
    }

    public static boolean a(String str, String str2, Y40 y40) {
        if (Build.VERSION.SDK_INT < 24) {
            C1723Vw c1723Vw = f;
            if (c1723Vw.containsKey(str)) {
                return Arrays.asList((String[]) c1723Vw.get(str)).contains(str2);
            }
            return true;
        }
        ULocale uLocaleI = L10.i(y40.g());
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = RuleBasedCollator.getKeywordValuesForLocale("co", uLocaleI, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocaleI, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String b(String str) {
        C1723Vw c1723Vw = c;
        return !c1723Vw.containsKey(str) ? str : (String) c1723Vw.get(str);
    }

    public static Object c(Object obj, String str) {
        if (str.equals("ca") && (obj instanceof String)) {
            String str2 = (String) obj;
            C1723Vw c1723Vw = d;
            return !c1723Vw.containsKey(str2) ? str2 : (String) c1723Vw.get(str2);
        }
        if (!str.equals("nu") || !(obj instanceof String)) {
            return (str.equals("co") && (obj instanceof String)) ? b((String) obj) : (str.equals("kn") && (obj instanceof String) && obj.equals("yes")) ? "true" : ((str.equals("kn") || str.equals("kf")) && (obj instanceof String) && obj.equals("no")) ? "false" : obj;
        }
        String str3 = (String) obj;
        C1723Vw c1723Vw2 = e;
        return !c1723Vw2.containsKey(str3) ? str3 : (String) c1723Vw2.get(str3);
    }
}
