package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class D70 extends B70 {

    /* renamed from: a */
    public final Field f1854a;

    /* renamed from: b */
    public final Field f1855b;

    /* renamed from: c */
    public final Field f1856c;

    public D70(Field field, Field field2, Field field3) {
        this.f1854a = field;
        this.f1855b = field2;
        this.f1856c = field3;
    }

    @Override // p000.B70
    /* renamed from: a */
    public final boolean mo507a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f1856c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // p000.B70
    /* renamed from: b */
    public final Object mo508b(InputMethodManager inputMethodManager) {
        try {
            return this.f1854a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // p000.B70
    /* renamed from: c */
    public final View mo509c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f1855b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
