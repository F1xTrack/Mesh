package p000;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.C1696a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: v3 */
/* loaded from: classes.dex */
public final class C6988v3 implements InterfaceC7331Ai1 {

    /* renamed from: a */
    public final C8342Tu0 f44115a = new C8342Tu0(14);

    /* renamed from: b */
    public final AdvancedExtenderImpl f44116b;

    /* renamed from: c */
    public String f44117c;

    /* renamed from: d */
    public final int f44118d;

    public C6988v3(int i) {
        try {
            if (i == 1) {
                this.f44116b = new BokehAdvancedExtenderImpl();
            } else if (i == 2) {
                this.f44116b = new HdrAdvancedExtenderImpl();
            } else if (i == 3) {
                this.f44116b = new NightAdvancedExtenderImpl();
            } else if (i == 4) {
                this.f44116b = new BeautyAdvancedExtenderImpl();
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
                }
                this.f44116b = new AutoAdvancedExtenderImpl();
            }
            this.f44118d = i;
        } catch (NoClassDefFoundError unused) {
            throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
        }
    }

    /* renamed from: j */
    public static List m25311j(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            arrayList.add(new Pair(num, (Size[]) ((List) map.get(num)).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: a */
    public final List mo291a() {
        AbstractC9104dM1.m17549h(this.f44117c, "VendorExtender#init() must be called first");
        return m25311j(this.f44116b.getSupportedCaptureOutputResolutions(this.f44117c));
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: b */
    public final List mo292b() {
        AbstractC9104dM1.m17549h(this.f44117c, "VendorExtender#init() must be called first");
        return m25311j(this.f44116b.getSupportedPreviewOutputResolutions(this.f44117c));
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: c */
    public final boolean mo293c() {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            return this.f44116b.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: d */
    public final List mo294d() {
        List listEmptyList = Collections.emptyList();
        if (AbstractC0783MR.m5366d().compareTo(C1299Ue.f11947h) < 0) {
            return listEmptyList;
        }
        try {
            return Collections.unmodifiableList(this.f44116b.getAvailableCaptureResultKeys());
        } catch (Exception unused) {
            AbstractC7806Jm0.m4409c("AdvancedVendorExtender");
            return listEmptyList;
        }
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: e */
    public final void mo295e(InterfaceC6766ro interfaceC6766ro) {
        InterfaceC6766ro interfaceC6766ro2 = interfaceC6766ro;
        this.f44117c = interfaceC6766ro2.mo2393e();
        this.f44116b.init(this.f44117c, T02.m7517a(interfaceC6766ro2));
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: f */
    public final Size[] mo296f() {
        AbstractC9104dM1.m17549h(this.f44117c, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: g */
    public final AbstractC9513gZ0 mo297g(Context context) {
        AbstractC9104dM1.m17549h(this.f44117c, "VendorExtender#init() must be called first");
        return new C1696a(this.f44116b.createSessionProcessor(), m25312k(), this, context, this.f44118d);
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: h */
    public final boolean mo298h(LinkedHashMap linkedHashMap, String str) {
        if (this.f44115a.m7819s0(str)) {
            return false;
        }
        return this.f44116b.isExtensionAvailable(str, linkedHashMap);
    }

    @Override // p000.InterfaceC7331Ai1
    /* renamed from: i */
    public final boolean mo299i() {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        if (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) {
            return this.f44116b.isPostviewAvailable();
        }
        return false;
    }

    /* renamed from: k */
    public final List m25312k() {
        List listEmptyList = Collections.emptyList();
        if (AbstractC0783MR.m5366d().compareTo(C1299Ue.f11947h) < 0) {
            return listEmptyList;
        }
        try {
            return Collections.unmodifiableList(this.f44116b.getAvailableCaptureRequestKeys());
        } catch (Exception unused) {
            AbstractC7806Jm0.m4409c("AdvancedVendorExtender");
            return listEmptyList;
        }
    }

    /* renamed from: l */
    public final Map m25313l(Size size) {
        C1299Ue c1299Ue = C1299Ue.f11948i;
        return (C4018et.m18064d(c1299Ue) && AbstractC0783MR.m5368h(c1299Ue)) ? Collections.unmodifiableMap(this.f44116b.getSupportedPostviewResolutions(size)) : Collections.emptyMap();
    }
}
