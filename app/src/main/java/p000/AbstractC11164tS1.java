package p000;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: tS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11164tS1 {
    /* renamed from: b */
    public static G21 m24935b(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        G21 g21;
        if (unsatisfiedLinkError.getMessage() == null || !unsatisfiedLinkError.getMessage().contains("ELF")) {
            Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
            if (matcher.find()) {
                matcher.group();
                O90.m5973k(3, "SoLoader");
                g21 = new E21(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
            } else {
                g21 = new G21(str, unsatisfiedLinkError.toString());
            }
        } else {
            O90.m5973k(3, "SoLoader");
            g21 = new E21(str, unsatisfiedLinkError.toString());
        }
        g21.initCause(unsatisfiedLinkError);
        return g21;
    }

    /* renamed from: a */
    public abstract List mo6097a(String str, List list);
}
