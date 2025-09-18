package defpackage;

import java.util.regex.Pattern;

/* renamed from: Bf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0115Bf1 {
    public static final Pattern a = Pattern.compile("attachment(?:;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1)?(?:;\\s*filename\\s*\\*\\s*=\\s*([^']*)'[^']*'([^']*))?\\s*$", 2);
}
