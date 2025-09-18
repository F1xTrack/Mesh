package defpackage;

import java.io.IOException;

/* renamed from: aD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2091aD extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public C2091aD(int i) {
        this.a = i;
    }

    public C2091aD(int i, Exception exc) {
        super(exc);
        this.a = i;
    }

    public C2091aD(String str, int i) {
        super(str);
        this.a = i;
    }

    public C2091aD(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
