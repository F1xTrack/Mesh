package p000;

import java.io.IOException;

/* renamed from: aD */
/* loaded from: classes.dex */
public class C1650aD extends IOException {

    /* renamed from: b */
    public static final /* synthetic */ int f15394b = 0;

    /* renamed from: a */
    public final int f15395a;

    public C1650aD(int i) {
        this.f15395a = i;
    }

    public C1650aD(int i, Exception exc) {
        super(exc);
        this.f15395a = i;
    }

    public C1650aD(String str, int i) {
        super(str);
        this.f15395a = i;
    }

    public C1650aD(String str, Exception exc, int i) {
        super(str, exc);
        this.f15395a = i;
    }
}
