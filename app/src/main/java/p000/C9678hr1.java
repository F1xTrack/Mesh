package p000;

/* renamed from: hr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9678hr1 {

    /* renamed from: a */
    public final /* synthetic */ int f28640a;

    /* renamed from: a */
    public final String m18883a(InterfaceC6524o interfaceC6524o) {
        String str;
        String str2;
        switch (this.f28640a) {
            case 0:
                if (interfaceC6524o.mo6177a().equals(C6398m.f37372c)) {
                    str = "/agcgw_all/CN";
                } else if (interfaceC6524o.mo6177a().equals(C6398m.f37374e)) {
                    str = "/agcgw_all/RU";
                } else if (interfaceC6524o.mo6177a().equals(C6398m.f37373d)) {
                    str = "/agcgw_all/DE";
                } else {
                    if (!interfaceC6524o.mo6177a().equals(C6398m.f37375f)) {
                        return null;
                    }
                    str = "/agcgw_all/SG";
                }
                return interfaceC6524o.getString(str);
            default:
                if (interfaceC6524o.mo6177a().equals(C6398m.f37372c)) {
                    str2 = "/agcgw_all/CN_back";
                } else if (interfaceC6524o.mo6177a().equals(C6398m.f37374e)) {
                    str2 = "/agcgw_all/RU_back";
                } else if (interfaceC6524o.mo6177a().equals(C6398m.f37373d)) {
                    str2 = "/agcgw_all/DE_back";
                } else {
                    if (!interfaceC6524o.mo6177a().equals(C6398m.f37375f)) {
                        return null;
                    }
                    str2 = "/agcgw_all/SG_back";
                }
                return interfaceC6524o.getString(str2);
        }
    }
}
