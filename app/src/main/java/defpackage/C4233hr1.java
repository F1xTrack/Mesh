package defpackage;

/* renamed from: hr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4233hr1 {
    public final /* synthetic */ int a;

    public final String a(InterfaceC6180o interfaceC6180o) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                if (interfaceC6180o.a().equals(C5798m.c)) {
                    str = "/agcgw_all/CN";
                } else if (interfaceC6180o.a().equals(C5798m.e)) {
                    str = "/agcgw_all/RU";
                } else if (interfaceC6180o.a().equals(C5798m.d)) {
                    str = "/agcgw_all/DE";
                } else {
                    if (!interfaceC6180o.a().equals(C5798m.f)) {
                        return null;
                    }
                    str = "/agcgw_all/SG";
                }
                return interfaceC6180o.getString(str);
            default:
                if (interfaceC6180o.a().equals(C5798m.c)) {
                    str2 = "/agcgw_all/CN_back";
                } else if (interfaceC6180o.a().equals(C5798m.e)) {
                    str2 = "/agcgw_all/RU_back";
                } else if (interfaceC6180o.a().equals(C5798m.d)) {
                    str2 = "/agcgw_all/DE_back";
                } else {
                    if (!interfaceC6180o.a().equals(C5798m.f)) {
                        return null;
                    }
                    str2 = "/agcgw_all/SG_back";
                }
                return interfaceC6180o.getString(str2);
        }
    }
}
