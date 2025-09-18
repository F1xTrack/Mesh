package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: wG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7760wG0 implements InterfaceC7211tO {
    public static final HashMap d;
    public final InterfaceC7211tO a;
    public final InterfaceC6907ro b;
    public final C3513e41 c;

    static {
        HashMap map = new HashMap();
        d = map;
        map.put(1, C6496pe.i);
        map.put(8, C6496pe.g);
        map.put(6, C6496pe.f);
        map.put(5, C6496pe.e);
        map.put(4, C6496pe.d);
        map.put(0, C6496pe.h);
    }

    public C7760wG0(InterfaceC7211tO interfaceC7211tO, InterfaceC6907ro interfaceC6907ro, C3513e41 c3513e41) {
        this.a = interfaceC7211tO;
        this.b = interfaceC6907ro;
        this.c = c3513e41;
    }

    @Override // defpackage.InterfaceC7211tO
    public final boolean h(int i) {
        if (this.a.h(i)) {
            C6496pe c6496pe = (C6496pe) d.get(Integer.valueOf(i));
            if (c6496pe != null) {
                Iterator it = this.c.B0(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk == null || !videoQualityQuirk.a(this.b, c6496pe) || ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).b())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC7211tO
    public final InterfaceC7402uO i(int i) {
        if (h(i)) {
            return this.a.i(i);
        }
        return null;
    }
}
