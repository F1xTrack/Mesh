package com.p018my.tracker.personalize;

/* loaded from: classes2.dex */
public final class PersonalizeResponse<T> {
    public final String error;
    public final String rawData;
    public final T result;

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalizeResponse(Object obj, String str, String str2) {
        this.result = obj;
        this.error = str;
        this.rawData = str2;
    }
}
