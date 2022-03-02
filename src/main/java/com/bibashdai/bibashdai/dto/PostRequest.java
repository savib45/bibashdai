package com.bibashdai.bibashdai.dto;

import com.bibashdai.bibashdai.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostRequest {
    private User user;
}
