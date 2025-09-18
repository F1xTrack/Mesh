package p000;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class XS1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f13792a;

    /* renamed from: b */
    public final /* synthetic */ String f13793b;

    /* renamed from: c */
    public final /* synthetic */ long f13794c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f13795d;

    /* renamed from: e */
    public final /* synthetic */ boolean f13796e;

    /* renamed from: f */
    public final /* synthetic */ boolean f13797f;

    /* renamed from: g */
    public final /* synthetic */ boolean f13798g;

    /* renamed from: h */
    public final /* synthetic */ FR1 f13799h;

    public XS1(FR1 fr1, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f13792a = str;
        this.f13793b = str2;
        this.f13794c = j;
        this.f13795d = bundle;
        this.f13796e = z;
        this.f13797f = z2;
        this.f13798g = z3;
        this.f13799h = fr1;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f13799h.m2638H1(this.f13792a, this.f13793b, this.f13794c, this.f13795d, this.f13796e, this.f13797f, this.f13798g);
    }
}
