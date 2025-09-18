package p000;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* renamed from: uN */
/* loaded from: classes.dex */
public final class C6945uN extends Editable.Factory {

    /* renamed from: a */
    public static final Object f43684a = new Object();

    /* renamed from: b */
    public static volatile C6945uN f43685b;

    /* renamed from: c */
    public static Class f43686c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f43686c;
        return cls != null ? SpannableBuilder.create(cls, charSequence) : super.newEditable(charSequence);
    }
}
