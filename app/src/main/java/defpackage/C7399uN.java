package defpackage;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* renamed from: uN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7399uN extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile C7399uN b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? SpannableBuilder.create(cls, charSequence) : super.newEditable(charSequence);
    }
}
