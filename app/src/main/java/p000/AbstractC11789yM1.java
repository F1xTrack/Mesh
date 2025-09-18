package p000;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: yM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11789yM1 {

    /* renamed from: a */
    public static final Uri f46230a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f46231b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f46232c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f46233d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
