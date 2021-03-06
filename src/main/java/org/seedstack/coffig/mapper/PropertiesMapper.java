/*
 * Copyright © 2013-2018, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.coffig.mapper;

import java.lang.reflect.Type;
import java.util.Properties;
import org.seedstack.coffig.TreeNode;
import org.seedstack.coffig.node.MapNode;
import org.seedstack.coffig.node.ValueNode;
import org.seedstack.coffig.spi.ConfigurationMapper;

public class PropertiesMapper implements ConfigurationMapper {
    @Override
    public boolean canHandle(Type type) {
        return type instanceof Class && type.equals(Properties.class);
    }

    @Override
    public Object map(TreeNode treeNode, Type type) {
        Properties properties = new Properties();
        if (treeNode.type() == TreeNode.Type.MAP_NODE) {
            treeNode.namedNodes()
                    .forEach(namedNode -> properties.setProperty(namedNode.name(), namedNode.node().value()));
        } else {
            treeNode.nodes().forEach(item -> properties.setProperty(item.value(), null));
        }
        return properties;
    }

    @Override
    public TreeNode unmap(Object object, Type type) {
        MapNode mapNode = new MapNode();
        ((Properties) object).forEach((key, value) -> {
            if (key != null) {
                mapNode.set(String.valueOf(key), new ValueNode(String.valueOf(value)));
            }
        });
        return mapNode;
    }
}
