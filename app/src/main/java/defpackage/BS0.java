package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class BS0 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public BS0(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
