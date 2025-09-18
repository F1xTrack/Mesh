package defpackage;

import org.json.JSONException;

/* renamed from: St, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1480St extends RuntimeException {
    public C1480St(String str, JSONException jSONException) {
        super(AbstractC8235ym.k("Unable to parse contents of ", str, ", the file may be corrupted."), jSONException);
    }
}
