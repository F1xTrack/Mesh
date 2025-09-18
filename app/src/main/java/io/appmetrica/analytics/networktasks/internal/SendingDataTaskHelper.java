package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.p026io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes2.dex */
public class SendingDataTaskHelper {

    /* renamed from: a */
    private final RequestBodyEncrypter f33144a;

    /* renamed from: b */
    private final Compressor f33145b;

    /* renamed from: c */
    private final TimeProvider f33146c;

    /* renamed from: d */
    private final RequestDataHolder f33147d;

    /* renamed from: e */
    private final ResponseDataHolder f33148e;

    /* renamed from: f */
    private final NetworkResponseHandler f33149f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f33149f.handle(this.f33148e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f33147d.applySendTime(this.f33146c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f33145b.compress(bArr);
            if (bArrCompress == null || (bArrEncrypt = this.f33144a.encrypt(bArrCompress)) == null) {
                return false;
            }
            this.f33147d.setPostData(bArrEncrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f33144a = requestBodyEncrypter;
        this.f33145b = compressor;
        this.f33146c = timeProvider;
        this.f33147d = requestDataHolder;
        this.f33148e = responseDataHolder;
        this.f33149f = networkResponseHandler;
    }
}
