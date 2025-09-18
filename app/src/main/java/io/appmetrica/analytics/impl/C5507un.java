package io.appmetrica.analytics.impl;

import org.json.JSONObject;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.un */
/* loaded from: classes2.dex */
public final class C5507un {

    /* renamed from: a */
    public final InterfaceC5582xn f32711a;

    /* renamed from: b */
    public final InterfaceC5582xn f32712b;

    /* renamed from: c */
    public final InterfaceC5532vn f32713c;

    /* renamed from: d */
    public JSONObject f32714d;

    public C5507un(InterfaceC5582xn interfaceC5582xn, InterfaceC5582xn interfaceC5582xn2, InterfaceC5532vn interfaceC5532vn) {
        this.f32711a = interfaceC5582xn;
        this.f32712b = interfaceC5582xn2;
        this.f32713c = interfaceC5532vn;
    }

    /* renamed from: a */
    public final synchronized JSONObject m21151a() {
        JSONObject jSONObject;
        try {
            if (this.f32714d == null) {
                JSONObject jSONObjectMo9775a = this.f32713c.mo9775a(m21150a(this.f32711a), m21150a(this.f32712b));
                this.f32714d = jSONObjectMo9775a;
                m21152a(jSONObjectMo9775a);
            }
            jSONObject = this.f32714d;
            if (jSONObject == null) {
                O90.m5977o("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m21150a(InterfaceC5582xn interfaceC5582xn) {
        try {
            String strMo20031a = interfaceC5582xn.mo20031a();
            return strMo20031a != null ? new JSONObject(strMo20031a) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public final synchronized void m21152a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f32711a.mo20032a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f32712b.mo20032a(string);
        } catch (Throwable unused2) {
        }
    }
}
