package com.yandex.mapkit.personalized_poi;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class PersonalizedPoiExtraMetadata implements BaseMetadata, Serializable {
    private List<PersonalizedPoiExtraMetadataEntry> data;
    private boolean data__is_initialized;
    private NativeObject nativeObject;

    public PersonalizedPoiExtraMetadata() {
        this.data__is_initialized = false;
    }

    private native List<PersonalizedPoiExtraMetadataEntry> getData__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::personalized_poi::PersonalizedPoiExtraMetadata";
    }

    private native NativeObject init(List<PersonalizedPoiExtraMetadataEntry> list);

    public synchronized List<PersonalizedPoiExtraMetadataEntry> getData() {
        try {
            if (!this.data__is_initialized) {
                this.data = getData__Native();
                this.data__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.data;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getData(), false, (ArchivingHandler) new ClassHandler(PersonalizedPoiExtraMetadataEntry.class));
            return;
        }
        List<PersonalizedPoiExtraMetadataEntry> listAdd = archive.add((List) this.data, false, (ArchivingHandler) new ClassHandler(PersonalizedPoiExtraMetadataEntry.class));
        this.data = listAdd;
        this.data__is_initialized = true;
        this.nativeObject = init(listAdd);
    }

    public PersonalizedPoiExtraMetadata(List<PersonalizedPoiExtraMetadataEntry> list) {
        this.data__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.data = list;
            this.data__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"data\" cannot be null");
    }

    private PersonalizedPoiExtraMetadata(NativeObject nativeObject) {
        this.data__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
