package com.dylanvann.fastimage;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import p000.AbstractC11705xi0;
import p000.C10457nx0;
import p000.C10585ox0;
import p000.C11481vx0;
import p000.C4136gl;
import p000.C6887tS;
import p000.C9239eQ0;
import p000.II1;
import p000.InterfaceC10869r90;
import p000.InterfaceC7076wS;
import p000.O90;

/* loaded from: classes.dex */
public class FastImageOkHttpProgressGlideModule extends AbstractC11705xi0 {
    private static final C6887tS progressListener = new C6887tS();

    private static InterfaceC10869r90 createInterceptor(InterfaceC7076wS interfaceC7076wS) {
        return new C4136gl(2, interfaceC7076wS);
    }

    public static void expect(String str, FastImageProgressListener fastImageProgressListener) {
        progressListener.f43079a.put(str, fastImageProgressListener);
    }

    public static void forget(String str) {
        C6887tS c6887tS = progressListener;
        c6887tS.f43079a.remove(str);
        c6887tS.f43080b.remove(str);
    }

    @Override // p000.AbstractC11705xi0
    public void registerComponents(Context context, ComponentCallbacks2C1874a componentCallbacks2C1874a, C9239eQ0 c9239eQ0) {
        if (II1.f4888e == null) {
            II1.f4888e = new C10585ox0(II1.m3810d());
        }
        C10457nx0 c10457nx0M23579a = II1.f4888e.m23579a();
        InterfaceC10869r90 interfaceC10869r90CreateInterceptor = createInterceptor(progressListener);
        O90.m5968f(interfaceC10869r90CreateInterceptor, "interceptor");
        c10457nx0M23579a.f38624c.add(interfaceC10869r90CreateInterceptor);
        c9239eQ0.m17940n(new C11481vx0(new C10585ox0(c10457nx0M23579a)));
    }
}
