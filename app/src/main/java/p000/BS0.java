package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class BS0 {

    /* renamed from: a */
    public final ColorStateList f823a;

    /* renamed from: b */
    public final Configuration f824b;

    /* renamed from: c */
    public final int f825c;

    public BS0(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f823a = colorStateList;
        this.f824b = configuration;
        this.f825c = theme == null ? 0 : theme.hashCode();
    }
}
