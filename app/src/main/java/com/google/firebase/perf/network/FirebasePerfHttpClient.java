package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p000.AbstractC1374Vq;
import p000.AbstractC8784av0;
import p000.C7731Ia1;
import p000.C8619Zc1;
import p000.C8654Zu0;
import p000.X80;

/* loaded from: classes.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpUriRequest.getURI().toString());
            c8654Zu0M9626c.m9629d(httpUriRequest.getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpUriRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            c8654Zu0M9626c.m9635j(c7731Ia1.m3946a());
            c8654Zu0M9626c.m9630e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM10379a2 = AbstractC8784av0.m10379a(httpResponseExecute);
            if (lM10379a2 != null) {
                c8654Zu0M9626c.m9634i(lM10379a2.longValue());
            }
            String strM10380b = AbstractC8784av0.m10380b(httpResponseExecute);
            if (strM10380b != null) {
                c8654Zu0M9626c.m9633h(strM10380b);
            }
            c8654Zu0M9626c.m9628b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpUriRequest.getURI().toString());
            c8654Zu0M9626c.m9629d(httpUriRequest.getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpUriRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            c8654Zu0M9626c.m9635j(c7731Ia1.m3946a());
            c8654Zu0M9626c.m9630e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM10379a2 = AbstractC8784av0.m10379a(httpResponseExecute);
            if (lM10379a2 != null) {
                c8654Zu0M9626c.m9634i(lM10379a2.longValue());
            }
            String strM10380b = AbstractC8784av0.m10380b(httpResponseExecute);
            if (strM10380b != null) {
                c8654Zu0M9626c.m9633h(strM10380b);
            }
            c8654Zu0M9626c.m9628b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpUriRequest.getURI().toString());
            c8654Zu0M9626c.m9629d(httpUriRequest.getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpUriRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            return (T) httpClient.execute(httpUriRequest, new X80(responseHandler, c7731Ia1, c8654Zu0M9626c));
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpUriRequest.getURI().toString());
            c8654Zu0M9626c.m9629d(httpUriRequest.getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpUriRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            return (T) httpClient.execute(httpUriRequest, new X80(responseHandler, c7731Ia1, c8654Zu0M9626c), httpContext);
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c8654Zu0M9626c.m9629d(httpRequest.getRequestLine().getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            c8654Zu0M9626c.m9635j(c7731Ia1.m3946a());
            c8654Zu0M9626c.m9630e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM10379a2 = AbstractC8784av0.m10379a(httpResponseExecute);
            if (lM10379a2 != null) {
                c8654Zu0M9626c.m9634i(lM10379a2.longValue());
            }
            String strM10380b = AbstractC8784av0.m10380b(httpResponseExecute);
            if (strM10380b != null) {
                c8654Zu0M9626c.m9633h(strM10380b);
            }
            c8654Zu0M9626c.m9628b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c8654Zu0M9626c.m9629d(httpRequest.getRequestLine().getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            c8654Zu0M9626c.m9635j(c7731Ia1.m3946a());
            c8654Zu0M9626c.m9630e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lM10379a2 = AbstractC8784av0.m10379a(httpResponseExecute);
            if (lM10379a2 != null) {
                c8654Zu0M9626c.m9634i(lM10379a2.longValue());
            }
            String strM10380b = AbstractC8784av0.m10380b(httpResponseExecute);
            if (strM10380b != null) {
                c8654Zu0M9626c.m9633h(strM10380b);
            }
            c8654Zu0M9626c.m9628b();
            return httpResponseExecute;
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c8654Zu0M9626c.m9629d(httpRequest.getRequestLine().getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            return (T) httpClient.execute(httpHost, httpRequest, new X80(responseHandler, c7731Ia1, c8654Zu0M9626c));
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        C8654Zu0 c8654Zu0M9626c = C8654Zu0.m9626c(C8619Zc1.f15028s);
        try {
            c8654Zu0M9626c.m9636k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c8654Zu0M9626c.m9629d(httpRequest.getRequestLine().getMethod());
            Long lM10379a = AbstractC8784av0.m10379a(httpRequest);
            if (lM10379a != null) {
                c8654Zu0M9626c.m9631f(lM10379a.longValue());
            }
            c7731Ia1.m3949d();
            c8654Zu0M9626c.m9632g(c7731Ia1.m3948c());
            return (T) httpClient.execute(httpHost, httpRequest, new X80(responseHandler, c7731Ia1, c8654Zu0M9626c), httpContext);
        } catch (IOException e) {
            AbstractC1374Vq.m8596o(c7731Ia1, c8654Zu0M9626c, c8654Zu0M9626c);
            throw e;
        }
    }
}
