package p000;

import org.json.JSONException;

/* renamed from: St */
/* loaded from: classes2.dex */
public final class C1188St extends RuntimeException {
    public C1188St(String str, JSONException jSONException) {
        super(AbstractC7222ym.m26234k("Unable to parse contents of ", str, ", the file may be corrupted."), jSONException);
    }
}
