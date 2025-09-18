package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.InterfaceC5908mZ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.f1 */
/* loaded from: classes2.dex */
public class C2741f1 implements Parcelable {
    public static final Parcelable.Creator<C2741f1> CREATOR = new b();
    private ResultReceiver a;
    private List<String> b;
    private Map<String, String> c;

    /* renamed from: com.yandex.metrica.impl.ob.f1$a */
    public class a implements InterfaceC5908mZ {
        public a(C2741f1 c2741f1) {
        }

        @Override // defpackage.InterfaceC5908mZ
        public Object invoke() {
            return P0.i().e();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.f1$b */
    public class b implements Parcelable.Creator<C2741f1> {
        @Override // android.os.Parcelable.Creator
        public C2741f1 createFromParcel(Parcel parcel) {
            return new C2741f1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C2741f1[] newArray(int i) {
            return new C2741f1[i];
        }
    }

    public C2741f1(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        this.b = list;
        this.a = resultReceiver;
        this.c = map == null ? new HashMap() : new HashMap(map);
    }

    public boolean a(Qi qi) {
        return Oi.a(qi, this.b, this.c, new a(this));
    }

    public List<String> b() {
        return this.b;
    }

    public ResultReceiver c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.a);
        if (this.b != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList<>(this.b));
        }
        Map<String, String> map = this.c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C3240ym.c(map));
        }
        parcel.writeBundle(bundle);
    }

    public Map<String, String> a() {
        return this.c;
    }

    public C2741f1(Parcel parcel) {
        Bundle bundle = parcel.readBundle(ResultReceiverC2939n0.class.getClassLoader());
        if (bundle != null) {
            this.a = (ResultReceiver) bundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.b = bundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.c = C3240ym.a(bundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.c = new HashMap();
    }
}
