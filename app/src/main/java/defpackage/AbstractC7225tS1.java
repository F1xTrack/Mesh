package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: tS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7225tS1 {
    public static G21 b(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        G21 g21;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                matcher.group();
                O90.k(3, "SoLoader");
                g21 = new E21(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                g21 = new G21(str, unsatisfiedLinkError.toString());
            }
        } else {
            O90.k(3, "SoLoader");
            g21 = new E21(str, unsatisfiedLinkError.toString());
        }
        g21.initCause(unsatisfiedLinkError);
        return g21;
    }

    public abstract List a(String str, List list);
}
