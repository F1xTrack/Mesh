package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: yM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8159yM1 {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
