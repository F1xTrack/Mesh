package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.InterfaceC6434mZ;

/* renamed from: com.yandex.metrica.impl.ob.f1 */
/* loaded from: classes2.dex */
public class C3247f1 implements Parcelable {
    public static final Parcelable.Creator<C3247f1> CREATOR = new b();

    /* renamed from: a */
    private ResultReceiver f23385a;

    /* renamed from: b */
    private List<String> f23386b;

    /* renamed from: c */
    private Map<String, String> f23387c;

    /* renamed from: com.yandex.metrica.impl.ob.f1$a */
    public class a implements InterfaceC6434mZ {
        public a(C3247f1 c3247f1) {
        }

        @Override // p000.InterfaceC6434mZ
        public Object invoke() {
            return C2842P0.m14728i().m14735e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f1$b */
    public class b implements Parcelable.Creator<C3247f1> {
        @Override // android.os.Parcelable.Creator
        public C3247f1 createFromParcel(Parcel parcel) {
            return new C3247f1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3247f1[] newArray(int i) {
            return new C3247f1[i];
        }
    }

    public C3247f1(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        this.f23386b = list;
        this.f23385a = resultReceiver;
        this.f23387c = map == null ? new HashMap() : new HashMap(map);
    }

    /* renamed from: a */
    public boolean m15868a(C2885Qi c2885Qi) {
        return C2835Oi.m14716a(c2885Qi, this.f23386b, this.f23387c, new a(this));
    }

    /* renamed from: b */
    public List<String> m15869b() {
        return this.f23386b;
    }

    /* renamed from: c */
    public ResultReceiver m15870c() {
        return this.f23385a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f23385a);
        if (this.f23386b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList<>(this.f23386b));
        }
        Map<String, String> map = this.f23387c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C3762ym.m17295c(map));
        }
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public Map<String, String> m15867a() {
        return this.f23387c;
    }

    public C3247f1(Parcel parcel) {
        Bundle bundle = parcel.readBundle(ResultReceiverC3454n0.class.getClassLoader());
        if (bundle != null) {
            this.f23385a = (ResultReceiver) bundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f23386b = bundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f23387c = C3762ym.m17274a(bundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f23387c = new HashMap();
    }
}
