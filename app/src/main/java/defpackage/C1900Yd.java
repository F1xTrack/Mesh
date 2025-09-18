package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: Yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1900Yd {
    public final long a;

    public C1900Yd(long j) {
        this.a = j;
    }

    public static C1900Yd a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C1900Yd(Long.parseLong(jsonReader.nextString())) : new C1900Yd(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1900Yd) {
            return this.a == ((C1900Yd) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return NX.i(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
