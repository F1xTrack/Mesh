package defpackage;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: uY */
/* loaded from: classes.dex */
public abstract class AbstractC7432uY {
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;

    public final void b(C7241tY c7241tY) {
        this.a.add(c7241tY);
        c7241tY.d = this.b;
        c7241tY.e = this.c;
        c7241tY.f = this.d;
        c7241tY.g = this.e;
    }

    public abstract void c(int i, Fragment fragment, String str, int i2);

    public final void d(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = 0;
        this.e = 0;
    }
}
