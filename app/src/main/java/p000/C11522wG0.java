package p000;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: wG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11522wG0 implements InterfaceC6883tO {

    /* renamed from: d */
    public static final HashMap f44740d;

    /* renamed from: a */
    public final InterfaceC6883tO f44741a;

    /* renamed from: b */
    public final InterfaceC6766ro f44742b;

    /* renamed from: c */
    public final C9196e41 f44743c;

    static {
        HashMap map = new HashMap();
        f44740d = map;
        map.put(1, C6630pe.f40253i);
        map.put(8, C6630pe.f40251g);
        map.put(6, C6630pe.f40250f);
        map.put(5, C6630pe.f40249e);
        map.put(4, C6630pe.f40248d);
        map.put(0, C6630pe.f40252h);
    }

    public C11522wG0(InterfaceC6883tO interfaceC6883tO, InterfaceC6766ro interfaceC6766ro, C9196e41 c9196e41) {
        this.f44741a = interfaceC6883tO;
        this.f44742b = interfaceC6766ro;
        this.f44743c = c9196e41;
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: h */
    public final boolean mo5443h(int i) {
        if (this.f44741a.mo5443h(i)) {
            C6630pe c6630pe = (C6630pe) f44740d.get(Integer.valueOf(i));
            if (c6630pe != null) {
                Iterator it = this.f44743c.m17838B0(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk == null || !videoQualityQuirk.mo9949a(this.f44742b, c6630pe) || ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).mo9885b())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: i */
    public final InterfaceC6946uO mo5444i(int i) {
        if (mo5443h(i)) {
            return this.f44741a.mo5444i(i);
        }
        return null;
    }
}
