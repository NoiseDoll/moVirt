package org.ovirt.mobile.movirt.provider;

import com.blandware.android.atleap.provider.ormlite.OrmLiteUriMatcher;

import org.ovirt.mobile.movirt.model.CaCert;
import org.ovirt.mobile.movirt.model.Cluster;
import org.ovirt.mobile.movirt.model.ConnectionInfo;
import org.ovirt.mobile.movirt.model.DataCenter;
import org.ovirt.mobile.movirt.model.Event;
import org.ovirt.mobile.movirt.model.Host;
import org.ovirt.mobile.movirt.model.StorageDomain;
import org.ovirt.mobile.movirt.model.Vm;
import org.ovirt.mobile.movirt.model.trigger.Trigger;

public class UriMatcher extends OrmLiteUriMatcher {
    public UriMatcher(String authority) {
        super(authority);
    }

    @Override
    public void instantiate() {
        addClass(OVirtContract.PATH_VMS, Vm.class);
        addClass(OVirtContract.PATH_VM, Vm.class);

        addClass(OVirtContract.PATH_CLUSTERS, Cluster.class);
        addClass(OVirtContract.PATH_CLUSTER, Cluster.class);

        addClass(OVirtContract.PATH_TRIGGERS, Trigger.class);
        addClass(OVirtContract.PATH_TRIGGER, Trigger.class);

        addClass(OVirtContract.PATH_EVENTS, Event.class);
        addClass(OVirtContract.PATH_EVENT, Event.class);

        addClass(OVirtContract.PATH_HOSTS, Host.class);
        addClass(OVirtContract.PATH_HOST, Host.class);

        addClass(OVirtContract.PATH_DATA_CENTERS, DataCenter.class);
        addClass(OVirtContract.PATH_DATA_CENTER, DataCenter.class);

        addClass(OVirtContract.PATH_STORAGE_DOMAINS, StorageDomain.class);
        addClass(OVirtContract.PATH_STORAGE_DOMAIN, StorageDomain.class);

        addClass(OVirtContract.PATH_CA_CRTS, CaCert.class);

        addClass(OVirtContract.PATH_CONNECTION_INFOS, ConnectionInfo.class);
        addClass(OVirtContract.PATH_CONNECTION_INFO, ConnectionInfo.class);
    }
}