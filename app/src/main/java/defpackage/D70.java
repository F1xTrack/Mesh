package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class D70 extends B70 {
    public final Field a;
    public final Field b;
    public final Field c;

    public D70(Field field, Field field2, Field field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // defpackage.B70
    public final boolean a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // defpackage.B70
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // defpackage.B70
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
